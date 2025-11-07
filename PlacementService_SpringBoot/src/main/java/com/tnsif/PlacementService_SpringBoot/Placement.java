package com.tnsif.PlacementService_SpringBoot;


import jakarta.persistence.*;

@Entity
//@Table(name = "Placement")
public class Placement {

    @Id
    @Column(name = "Placement_Id")
    private int placementId;

    @Column(name = "Company_Name")
    private String companyName;

    @Column(name = "Job_Role")
    private String jobRole;

    @Column(name = "Package")
    private double packageOffered;

    @Column(name = "Location")
    private String location;

    @Column(name = "Eligibility_Criteria")
    private String eligibilityCriteria;

    @Column(name = "Interview_Date")
    private String interviewDate;

    // Default Constructor
    public Placement() {
        super();
    }

    // Parameterized Constructor
    public Placement(int placementId, String companyName, String jobRole, double packageOffered,
                     String location, String eligibilityCriteria, String interviewDate) {
        super();
        this.placementId = placementId;
        this.companyName = companyName;
        this.jobRole = jobRole;
        this.packageOffered = packageOffered;
        this.location = location;
        this.eligibilityCriteria = eligibilityCriteria;
        this.interviewDate = interviewDate;
    }

    // Getters and Setters
    public int getPlacementId() {
        return placementId;
    }

    public void setPlacementId(int placementId) {
        this.placementId = placementId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public double getPackageOffered() {
        return packageOffered;
    }

    public void setPackageOffered(double packageOffered) {
        this.packageOffered = packageOffered;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEligibilityCriteria() {
        return eligibilityCriteria;
    }

    public void setEligibilityCriteria(String eligibilityCriteria) {
        this.eligibilityCriteria = eligibilityCriteria;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }

    @Override
    public String toString() {
        return "Placement [placementId=" + placementId + ", companyName=" + companyName + ", jobRole=" + jobRole +
                ", packageOffered=" + packageOffered + ", location=" + location + ", eligibilityCriteria=" +
                eligibilityCriteria + ", interviewDate=" + interviewDate + "]";
    }
}
