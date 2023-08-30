package com.collectionHW_5;
import java.util.*;
public class Project {

    private String projectName;
    private String projectDetails;
    private Set<String>teamMembers;

    public Project(String projectName, String projectDetails) {
        this.projectName = projectName;
        this.projectDetails = projectDetails;
        this.teamMembers = new HashSet<>();
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectDetails() {
        return projectDetails;
    }

    public Set<String> getTeamMembers() {
        return teamMembers;
    }
    public void addTeamMember(String teamMember) {
        teamMembers.add(teamMember);
    }



    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", projectDetails='" + projectDetails + '\'' +
                ", teamMembers=" + teamMembers +
                '}';
    }
}
