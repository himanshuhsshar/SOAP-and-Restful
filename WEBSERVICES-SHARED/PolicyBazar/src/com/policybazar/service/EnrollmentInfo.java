// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.policybazar.service;


public class EnrollmentInfo {
    protected java.lang.String planNo;
    protected int tenure;
    protected float insurredAmount;
    
    public EnrollmentInfo() {
    }
    
    public EnrollmentInfo(java.lang.String planNo, int tenure, float insurredAmount) {
        this.planNo = planNo;
        this.tenure = tenure;
        this.insurredAmount = insurredAmount;
    }
    
    public java.lang.String getPlanNo() {
        return planNo;
    }
    
    public void setPlanNo(java.lang.String planNo) {
        this.planNo = planNo;
    }
    
    public int getTenure() {
        return tenure;
    }
    
    public void setTenure(int tenure) {
        this.tenure = tenure;
    }
    
    public float getInsurredAmount() {
        return insurredAmount;
    }
    
    public void setInsurredAmount(float insurredAmount) {
        this.insurredAmount = insurredAmount;
    }
}
