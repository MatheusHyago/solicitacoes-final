
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoSolicitacao;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pesquisarSolicitacaoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pesquisarSolicitacaoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="idSolicitacaoRef" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *             &lt;element name="exibirCancelados" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="exibirPendentesAprovacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="dataInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="dataFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *             &lt;element name="registroInicial"&gt;
 *               &lt;simpleType&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                   &lt;minInclusive value="1"/&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/simpleType&gt;
 *             &lt;/element&gt;
 *             &lt;element name="quantidadeRegistros" minOccurs="0"&gt;
 *               &lt;simpleType&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                   &lt;maxInclusive value="50"/&gt;
 *                   &lt;minInclusive value="1"/&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/simpleType&gt;
 *             &lt;/element&gt;
 *             &lt;element name="sincronizado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="exibirCancelados" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *             &lt;element name="exibirPendentesAprovacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="exibirRemarks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="exibirAprovadas" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tipoSolicitacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoSolicitacao" minOccurs="0"/&gt;
 *         &lt;element name="dataAlteracaoInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataAlteracaoFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarSolicitacaoRequest", propOrder = {
    "content"
})
public class PesquisarSolicitacaoRequest {

    @XmlElementRefs({
        @XmlElementRef(name = "version", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "idSolicitacaoRef", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exibirCancelados", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exibirPendentesAprovacao", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dataInicial", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dataFinal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "registroInicial", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "quantidadeRegistros", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sincronizado", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exibirRemarks", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exibirAprovadas", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tipoSolicitacao", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dataAlteracaoInicial", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dataAlteracaoFinal", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Obtém o restante do modelo do conteúdo. 
     * 
     * <p>
     * Você está obtendo esta propriedade "catch-all" pelo seguinte motivo: 
     * O nome do campo "ExibirCancelados" é usado por duas partes diferentes de um esquema. Consulte: 
     * linha 0 de https://treinamento.lemontech.com.br:443/wsselfbooking/WsSelfBookingService?xsd=17
     * linha 0 de https://treinamento.lemontech.com.br:443/wsselfbooking/WsSelfBookingService?xsd=17
     * <p>
     * Para eliminar esta propriedade, aplique uma personalização de propriedade a uma 
     * das seguintes declarações, a fim de alterar seus nomes: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TipoSolicitacao }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
