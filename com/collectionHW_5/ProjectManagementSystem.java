package com.collectionHW_5;

import java.util.HashMap;
import java.util.Map;

public class ProjectManagementSystem {
    public static void main(String[] args) {
        Map<String,Project> projects=new HashMap<>();

        Project project1 = new Project("Project A", "Develop a new website");
        Project project2 = new Project("Project B", "Create a mobile app");
        Project project3=new Project("Project c" , "create a banking system ");


        projects.put(project1.getProjectName(), project1);
        projects.put(project2.getProjectName(), project2);
        projects.put(project3.getProjectDetails(),project3);

        project1.addTeamMember("Alia");
        project1.addTeamMember("vicky");
        project2.addTeamMember("siddhart");
        project2.addTeamMember("varun");
        project3.addTeamMember("kiara");
        project3.addTeamMember("shraddha");

        System.out.println("Project Details:");
        for (Project project : projects.values()) {
            System.out.println(project);
            System.out.println();
        }




    }
}
