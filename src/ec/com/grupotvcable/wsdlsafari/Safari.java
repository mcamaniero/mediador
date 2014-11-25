
package ec.com.grupotvcable.wsdlsafari;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Safari complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Safari">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdTroncal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Plan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumPiloto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EndpointProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Citem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Lenguaje" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BarredLevelType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TarriffPlan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BarredPin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Feature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Accion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatoS1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatoS2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatoS3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatoS4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Safari", propOrder = {
    "estado",
    "telefono",
    "idTroncal",
    "plan",
    "numPiloto",
    "ip",
    "endpointProfile",
    "citem",
    "user",
    "password",
    "lenguaje",
    "barredLevelType",
    "tarriffPlan",
    "barredPin",
    "feature",
    "accion",
    "datoS1",
    "datoS2",
    "datoS3",
    "datoS4"
})
public class Safari {

    @XmlElement(name = "Estado", required = true)
    protected String estado;
    @XmlElement(name = "Telefono")
    protected int telefono;
    @XmlElement(name = "IdTroncal")
    protected int idTroncal;
    @XmlElement(name = "Plan")
    protected int plan;
    @XmlElement(name = "NumPiloto")
    protected int numPiloto;
    @XmlElement(name = "Ip", required = true)
    protected String ip;
    @XmlElement(name = "EndpointProfile", required = true)
    protected String endpointProfile;
    @XmlElement(name = "Citem")
    protected int citem;
    @XmlElement(name = "User")
    protected int user;
    @XmlElement(name = "Password")
    protected int password;
    @XmlElement(name = "Lenguaje")
    protected int lenguaje;
    @XmlElement(name = "BarredLevelType", required = true)
    protected String barredLevelType;
    @XmlElement(name = "TarriffPlan")
    protected int tarriffPlan;
    @XmlElement(name = "BarredPin", required = true)
    protected String barredPin;
    @XmlElement(name = "Feature", required = true)
    protected String feature;
    @XmlElement(name = "Accion", required = true)
    protected String accion;
    @XmlElement(name = "DatoS1", required = true)
    protected String datoS1;
    @XmlElement(name = "DatoS2", required = true)
    protected String datoS2;
    @XmlElement(name = "DatoS3", required = true)
    protected String datoS3;
    @XmlElement(name = "DatoS4", required = true)
    protected String datoS4;

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     */
    public void setTelefono(int value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the idTroncal property.
     * 
     */
    public int getIdTroncal() {
        return idTroncal;
    }

    /**
     * Sets the value of the idTroncal property.
     * 
     */
    public void setIdTroncal(int value) {
        this.idTroncal = value;
    }

    /**
     * Gets the value of the plan property.
     * 
     */
    public int getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     */
    public void setPlan(int value) {
        this.plan = value;
    }

    /**
     * Gets the value of the numPiloto property.
     * 
     */
    public int getNumPiloto() {
        return numPiloto;
    }

    /**
     * Sets the value of the numPiloto property.
     * 
     */
    public void setNumPiloto(int value) {
        this.numPiloto = value;
    }

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Gets the value of the endpointProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndpointProfile() {
        return endpointProfile;
    }

    /**
     * Sets the value of the endpointProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndpointProfile(String value) {
        this.endpointProfile = value;
    }

    /**
     * Gets the value of the citem property.
     * 
     */
    public int getCitem() {
        return citem;
    }

    /**
     * Sets the value of the citem property.
     * 
     */
    public void setCitem(int value) {
        this.citem = value;
    }

    /**
     * Gets the value of the user property.
     * 
     */
    public int getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     */
    public void setUser(int value) {
        this.user = value;
    }

    /**
     * Gets the value of the password property.
     * 
     */
    public int getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     */
    public void setPassword(int value) {
        this.password = value;
    }

    /**
     * Gets the value of the lenguaje property.
     * 
     */
    public int getLenguaje() {
        return lenguaje;
    }

    /**
     * Sets the value of the lenguaje property.
     * 
     */
    public void setLenguaje(int value) {
        this.lenguaje = value;
    }

    /**
     * Gets the value of the barredLevelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarredLevelType() {
        return barredLevelType;
    }

    /**
     * Sets the value of the barredLevelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarredLevelType(String value) {
        this.barredLevelType = value;
    }

    /**
     * Gets the value of the tarriffPlan property.
     * 
     */
    public int getTarriffPlan() {
        return tarriffPlan;
    }

    /**
     * Sets the value of the tarriffPlan property.
     * 
     */
    public void setTarriffPlan(int value) {
        this.tarriffPlan = value;
    }

    /**
     * Gets the value of the barredPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarredPin() {
        return barredPin;
    }

    /**
     * Sets the value of the barredPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarredPin(String value) {
        this.barredPin = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeature(String value) {
        this.feature = value;
    }

    /**
     * Gets the value of the accion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccion() {
        return accion;
    }

    /**
     * Sets the value of the accion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccion(String value) {
        this.accion = value;
    }

    /**
     * Gets the value of the datoS1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoS1() {
        return datoS1;
    }

    /**
     * Sets the value of the datoS1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoS1(String value) {
        this.datoS1 = value;
    }

    /**
     * Gets the value of the datoS2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoS2() {
        return datoS2;
    }

    /**
     * Sets the value of the datoS2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoS2(String value) {
        this.datoS2 = value;
    }

    /**
     * Gets the value of the datoS3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoS3() {
        return datoS3;
    }

    /**
     * Sets the value of the datoS3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoS3(String value) {
        this.datoS3 = value;
    }

    /**
     * Gets the value of the datoS4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoS4() {
        return datoS4;
    }

    /**
     * Sets the value of the datoS4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoS4(String value) {
        this.datoS4 = value;
    }

}
