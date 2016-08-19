
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stock-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stock-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stockId",
    "stockName",
    "quantity"
})
@XmlRootElement(name = "event")
public class Event {

    @XmlElement(name = "stock-id", required = true)
    protected String stockId;
    @XmlElement(name = "stock-name", required = true)
    protected String stockName;
    @XmlElement(required = true)
    protected String quantity;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the stockId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockId() {
        return stockId;
    }

    /**
     * Sets the value of the stockId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockId(String value) {
        this.stockId = value;
    }

    /**
     * Gets the value of the stockName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * Sets the value of the stockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockName(String value) {
        this.stockName = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
