package main.model;

public class Minister_Assistant {
    private int assistantId;
    private String assistantName;
    private String assistantEmail;
    private String assistantPassword;
    private String assistantDept;
    private String complaint;

    public Minister_Assistant(int assistantId,String assistantName,String assistantEmail,String assistantPassword,String assistantDept,String complaint){
        this.assistantId = assistantId;
        this.assistantName = assistantName;
        this.assistantEmail = assistantEmail;
        this.assistantPassword = assistantPassword;
        this.assistantDept = assistantDept;
        this.complaint = complaint;
    }
}
