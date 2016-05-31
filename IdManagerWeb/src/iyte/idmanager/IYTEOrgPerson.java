/**
 * IYTEOrgPerson.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package iyte.idmanager;

public class IYTEOrgPerson  implements IPerson {
    private java.lang.String fullName;
    private java.lang.String givenName;
    private java.lang.String lastName;
    private java.lang.String mailAccount;
    private java.lang.String middleName;
    private java.lang.String userId;
    private java.lang.String password;

    public IYTEOrgPerson() {
    }

    public IYTEOrgPerson(String userId, String password) {
		if(userId == null || userId.trim().length() == 0) throw new IllegalStateException("Must Provide A valid username");
		if(password == null || password.trim().length() == 0) throw new IllegalStateException("Must Provide A valid password");
		this.userId = userId;
		this.password = password;
	}
	
	public IYTEOrgPerson(String userId, String password, String givenName, String middleName, String lastName) {
		this(userId, password);
		this.givenName = givenName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public IYTEOrgPerson(String userId, String password, String givenName, String middleName, String lastName, String mailAccount) {
		this(userId, password, givenName, middleName, lastName);
		this.mailAccount = mailAccount;
	}

	public boolean verifyPassword(String password) {
		if(this.password == null || this.password.trim().length() == 0) return false;
		if(password == null || password.trim().length() == 0) return false;
		if(this.password.trim().equals(password.trim())) return true;
		return false;
	}

    /**
     * Gets the fullName value for this IYTEOrgPerson.
     * 
     * @return fullName
     */
	public String getFullName() {
		return fullName;
	}
	
	protected String getPassword() {
		return password;
	}
	
	public boolean setPassword(String oldPassword, String newPassword) {
		if(!verifyPassword(oldPassword)) return false;
		password = newPassword;
		return true;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    /**
     * Sets the fullName value for this IYTEOrgPerson.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the givenName value for this IYTEOrgPerson.
     * 
     * @return givenName
     */
    public java.lang.String getGivenName() {
        return givenName;
    }


    /**
     * Sets the givenName value for this IYTEOrgPerson.
     * 
     * @param givenName
     */
    public void setGivenName(java.lang.String givenName) {
        this.givenName = givenName;
    }


    /**
     * Gets the lastName value for this IYTEOrgPerson.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this IYTEOrgPerson.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the mailAccount value for this IYTEOrgPerson.
     * 
     * @return mailAccount
     */
    public java.lang.String getMailAccount() {
        return mailAccount;
    }


    /**
     * Sets the mailAccount value for this IYTEOrgPerson.
     * 
     * @param mailAccount
     */
    public void setMailAccount(java.lang.String mailAccount) {
        this.mailAccount = mailAccount;
    }


    /**
     * Gets the middleName value for this IYTEOrgPerson.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this IYTEOrgPerson.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the userId value for this IYTEOrgPerson.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this IYTEOrgPerson.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IYTEOrgPerson)) return false;
        IYTEOrgPerson other = (IYTEOrgPerson) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.givenName==null && other.getGivenName()==null) || 
             (this.givenName!=null &&
              this.givenName.equals(other.getGivenName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.mailAccount==null && other.getMailAccount()==null) || 
             (this.mailAccount!=null &&
              this.mailAccount.equals(other.getMailAccount()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getGivenName() != null) {
            _hashCode += getGivenName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getMailAccount() != null) {
            _hashCode += getMailAccount().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IYTEOrgPerson.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:idmanager.iyte", "IYTEOrgPerson"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("givenName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "givenName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "middleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
