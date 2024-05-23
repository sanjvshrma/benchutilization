package com.cg.benchutilization.model;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Employee {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "primary_sequence",
            sequenceName = "primary_sequence",
            allocationSize = 1,
            initialValue = 10000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "primary_sequence"
    )
    private Integer id;

    @Column(length = 12)
    private String localEmployeeId;

    @Column
    private Integer globalGroupId;

    @Column
    private String name;

    @Column(length = 50)
    private String localGrade;

    @Column(length = 100)
    private String roleName;

    @Column(length = 100)
    private String productionUnit;

    @Column(length = 100)
    private String productionUnitName;

    @Column(length = 100)
    private String localApprover;

    @Column(length = 100)
    private String peopleManager;

    @Column(length = 50)
    private String projectCode;

    @Column
    private String projectName;

    @Column(length = 100)
    private String clientGroupName;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column(length = 20)
    private String loading;

    @Column(length = 20)
    private String leaversLastWorkingDay;

    @Column(length = 50)
    private String typeOfProject;

    @Column(length = 50)
    private String category;

    @Column(length = 100)
    private String baseLocation;

    @Column(length = 15)
    private String endDate2;

    @Column(length = 100)
    private String productionUnitRmName;

    @Column(length = 100)
    private String resourcePracticeArea;

    @Column(length = 50)
    private String bookingType;

    @Column
    private Date joiningDateDhr;

    @Column(length = 100)
    private String finalClientName;

    @Column(length = 100)
    private String city;

    @Column(length = 20)
    private String empIndiaStatus;

    @Column(length = 20)
    private String mm;

    @Column(length = 50)
    private String engineeringUnit;

    @Column(length = 50)
    private String cluster;

    @Column(length = 100)
    private String elMapping;

    @Column(length = 20)
    private String billability;

    @Column(length = 50)
    private String type;

    @Column(length = 100)
    private String skillGroup;

    @Column(length = 50)
    private String source;

    @Column(length = 20)
    private String internal;

    @Column(length = 50)
    private String mappedGrade;

    @Column(length = 50)
    private String finalGrade;

    @Column(length = 50)
    private String category2;

    @Column(length = 100)
    private String verticalSegment;

    @Column
    private Date targetBillingDateOrBlockedFromDate;

    @Column(length = 100)
    private String targetCustomer;

    @Column(length = 50)
    private String manualAllocationCategory;

    @Column(length = 100)
    private String edmMapping;

    @Column(length = 20)
    private String buManualChange;

    @Column(length = 20)
    private String resigned;

    @Column(length = 20)
    private String shadow;

    @Column(length = 100)
    private String geoMapping;

    @Column(length = 100)
    private String serviceLine;

    @Column
    private LocalDateTime record_insert_date;

 }
