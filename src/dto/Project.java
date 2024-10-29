package dto;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 29 Oct 2024
 */

public class Project {

    private String projectCode;
    private String name;
    private String client;
    private String buLeadName;

    // No-argument constructor
    public Project() {
    }

    // All-argument constructor
    public Project(String projectCode, String name, String client, String buLeadName) {
        this.projectCode = projectCode;
        this.name = name;
        this.client = client;
        this.buLeadName = buLeadName;
    }

    // Getters and Setters
    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getBuLeadName() {
        return buLeadName;
    }

    public void setBuLeadName(String buLeadName) {
        this.buLeadName = buLeadName;
    }


}

