
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import java.util.ArrayList;
import java.util.List;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.carro.Carro;
import br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.Hotel;
import br.com.lemontech.selfbooking.wsselfbooking.beans.outro.Outro;
import br.com.lemontech.selfbooking.wsselfbooking.beans.rodoviario.Rodoviario;
import br.com.lemontech.selfbooking.wsselfbooking.beans.seguro.Seguro;
import br.com.lemontech.selfbooking.wsselfbooking.beans.traslado.Traslado;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de produtos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="produtos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="aereo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}aereo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hotel" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/hotel}hotel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="carro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/carro}carro" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/outro}outro" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="seguro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/seguro}seguro" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="traslado" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/traslado}traslado" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rodoviario" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/rodoviario}rodoviario" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produtos", propOrder = {
    "aereo",
    "hotel",
    "carro",
    "outro",
    "seguro",
    "traslado",
    "rodoviario"
})
public class Produtos {

    @XmlElement(nillable = true)
    protected List<Aereo> aereo;
    @XmlElement(nillable = true)
    protected List<Hotel> hotel;
    @XmlElement(nillable = true)
    protected List<Carro> carro;
    @XmlElement(nillable = true)
    protected List<Outro> outro;
    @XmlElement(nillable = true)
    protected List<Seguro> seguro;
    @XmlElement(nillable = true)
    protected List<Traslado> traslado;
    @XmlElement(nillable = true)
    protected List<Rodoviario> rodoviario;

    /**
     * Gets the value of the aereo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the aereo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAereo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aereo }
     * 
     * 
     */
    public List<Aereo> getAereo() {
        if (aereo == null) {
            aereo = new ArrayList<Aereo>();
        }
        return this.aereo;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hotel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hotel }
     * 
     * 
     */
    public List<Hotel> getHotel() {
        if (hotel == null) {
            hotel = new ArrayList<Hotel>();
        }
        return this.hotel;
    }

    /**
     * Gets the value of the carro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the carro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Carro }
     * 
     * 
     */
    public List<Carro> getCarro() {
        if (carro == null) {
            carro = new ArrayList<Carro>();
        }
        return this.carro;
    }

    /**
     * Gets the value of the outro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the outro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Outro }
     * 
     * 
     */
    public List<Outro> getOutro() {
        if (outro == null) {
            outro = new ArrayList<Outro>();
        }
        return this.outro;
    }

    /**
     * Gets the value of the seguro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the seguro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeguro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Seguro }
     * 
     * 
     */
    public List<Seguro> getSeguro() {
        if (seguro == null) {
            seguro = new ArrayList<Seguro>();
        }
        return this.seguro;
    }

    /**
     * Gets the value of the traslado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the traslado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraslado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Traslado }
     * 
     * 
     */
    public List<Traslado> getTraslado() {
        if (traslado == null) {
            traslado = new ArrayList<Traslado>();
        }
        return this.traslado;
    }

    /**
     * Gets the value of the rodoviario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rodoviario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRodoviario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rodoviario }
     * 
     * 
     */
    public List<Rodoviario> getRodoviario() {
        if (rodoviario == null) {
            rodoviario = new ArrayList<Rodoviario>();
        }
        return this.rodoviario;
    }

}
