// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.religareinsurance.service;


public class PolicyManager_enroll_RequestStruct {
    protected com.religareinsurance.service.MemberInfo memberInfo;
    protected com.religareinsurance.service.EnrollmentInfo enrollmentInfo;
    
    public PolicyManager_enroll_RequestStruct() {
    }
    
    public PolicyManager_enroll_RequestStruct(com.religareinsurance.service.MemberInfo memberInfo, com.religareinsurance.service.EnrollmentInfo enrollmentInfo) {
        this.memberInfo = memberInfo;
        this.enrollmentInfo = enrollmentInfo;
    }
    
    public com.religareinsurance.service.MemberInfo getMemberInfo() {
        return memberInfo;
    }
    
    public void setMemberInfo(com.religareinsurance.service.MemberInfo memberInfo) {
        this.memberInfo = memberInfo;
    }
    
    public com.religareinsurance.service.EnrollmentInfo getEnrollmentInfo() {
        return enrollmentInfo;
    }
    
    public void setEnrollmentInfo(com.religareinsurance.service.EnrollmentInfo enrollmentInfo) {
        this.enrollmentInfo = enrollmentInfo;
    }
}
