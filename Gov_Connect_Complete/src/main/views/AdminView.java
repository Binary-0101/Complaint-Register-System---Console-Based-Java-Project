package main.views;

import java.util.List;
import java.util.Scanner;

import main.controller.AdminController;
import main.model.Issue;
import main.model.Minister_Assistant;

public class AdminView {
    private static final Scanner sc = Main.sc;

    public static void adminView(int adminId) {
        System.out.println("===========================================");
        System.out.println("|    Choose an Option:                    |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| (1) View the Raise Issue Table          |");
        System.out.println("| (2) Exit                                |");
        System.out.println("===========================================");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                List<Issue> list = AdminController.viewIssueTable(adminId);
                if (list.size() == 0) {
                    System.out.println("No issue raised to this department");
                }
                list.stream().forEach(System.out::println);

                System.out.println("┌───────────────────┐\r\n" + //
                        "│ (1) To Assign Work│\r\n" + //
                        "└───────────────────┘\r\n" + //
                        "");
                System.out.println("┌───────────────────────────────┐\r\n" + //
                        "│ (2) If the Issue Still Needs to Be in Waiting List     │\r\n" + //
                        "└───────────────────────────────┘");
                choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("To whom do you want to assign the task:");
                    
                    AdminController.changeStatustoAssigned(adminId);
                    System.out.println("Status Updated to Work Assigned");
                    int assistantId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Complaint Id that you want to assign to your Assistant");
                    int complaintId = sc.nextInt();

                    AdminController.addWorkToAssistant(assistantId,complaintId);

                } else
                    System.out.println("┌───────────────┐\r\n" + //
                            "│   Thank You   │\r\n" + //z
                            "└───────────────┘");
                break;

            default:
                break;
        }
    }

}
