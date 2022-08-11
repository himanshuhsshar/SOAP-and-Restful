// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.religareinsurance.service;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class EnrollmentInfo_SOAPBuilder implements SOAPInstanceBuilder {
    private com.religareinsurance.service.EnrollmentInfo _instance;
    private java.lang.String planNo;
    private int tenure;
    private float insurredAmount;
    private static final int myPLANNO_INDEX = 0;
    private static final int myTENURE_INDEX = 1;
    private static final int myINSURREDAMOUNT_INDEX = 2;
    
    public EnrollmentInfo_SOAPBuilder() {
    }
    
    public void setPlanNo(java.lang.String planNo) {
        this.planNo = planNo;
    }
    
    public void setTenure(int tenure) {
        this.tenure = tenure;
    }
    
    public void setInsurredAmount(float insurredAmount) {
        this.insurredAmount = insurredAmount;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case myPLANNO_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public void construct() {
    }
    
    public void setMember(int index, java.lang.Object memberValue) {
        try {
            switch(index) {
                case myPLANNO_INDEX:
                    _instance.setPlanNo((java.lang.String)memberValue);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        catch (java.lang.RuntimeException e) {
            throw e;
        }
        catch (java.lang.Exception e) {
            throw new DeserializationException(new LocalizableExceptionAdapter(e));
        }
    }
    
    public void initialize() {
    }
    
    public void setInstance(java.lang.Object instance) {
        _instance = (com.religareinsurance.service.EnrollmentInfo)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}
