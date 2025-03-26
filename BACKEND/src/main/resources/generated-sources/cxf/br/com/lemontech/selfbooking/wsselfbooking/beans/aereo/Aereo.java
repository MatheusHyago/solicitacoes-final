
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Agente;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.EnumStatusBilhete;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.IdentificadoresIntegracao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remarks;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de aereo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="aereo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="localizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localizadorGds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoReservador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeReservador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataVencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataReserva" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="menorTarifa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="maiorTarifa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ciaMenorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoFornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idPassageiroRef" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="aereoTarifa" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}aereoTarifa" minOccurs="0"/&gt;
 *         &lt;element name="aereoSeguimento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}aereoSeguimento" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="formaPagamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}formaPagamento" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="aereoBilhete" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}aereoBilhete" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="selfbook" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="justificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="canceladoEmitido" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nacional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="codigoJustificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoVoo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificadorIntegracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificadorBackOfficeTipoProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remarks" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}remarks" minOccurs="0"/&gt;
 *         &lt;element name="statusCancelamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="valorMulta" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorReembolso" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dataModificacaoStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="usuarioModificouStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="totalAereo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cancelado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="identificadoresIntegracao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}identificadoresIntegracao" minOccurs="0"/&gt;
 *         &lt;element name="reemissao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}reemissao" minOccurs="0"/&gt;
 *         &lt;element name="consolidadora" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}consolidadora" minOccurs="0"/&gt;
 *         &lt;element name="autoEmissao" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="importado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="online" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="complementoJustificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agenteOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="opcaoRota" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="pontoVenda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}pontoVendaOrcamento" minOccurs="0"/&gt;
 *         &lt;element name="localizadorPreTripGds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="credencial" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}credencial" minOccurs="0"/&gt;
 *         &lt;element name="ciaValidadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="milhas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codigoConsultor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeConsultor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailConsultor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeTipoProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="baseTarifaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="agenteCotacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}agente" minOccurs="0"/&gt;
 *         &lt;element name="agenteEmissao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}agente" minOccurs="0"/&gt;
 *         &lt;element name="observacoesGerais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tarifaFornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idOperador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeUsuarioModificouStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusBilhete" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}enumStatusBilhete" minOccurs="0"/&gt;
 *         &lt;element name="dataOrcamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="quantidadeConexao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="validadeBilhete" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="carbono" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quantidadeArvores" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="quantidadeEscala" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ordemcompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tarifaMedia" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="idCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cartaoCp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fonePax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rgPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cpfPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataNascimentoPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aereo", propOrder = {
    "id",
    "localizador",
    "localizadorGds",
    "source",
    "codigoEmissor",
    "nomeEmissor",
    "emailEmissor",
    "codigoReservador",
    "nomeReservador",
    "dataVencimento",
    "dataEmissao",
    "dataReserva",
    "menorTarifa",
    "maiorTarifa",
    "ciaMenorTarifa",
    "codigoFornecedor",
    "idPassageiroRef",
    "aereoTarifa",
    "aereoSeguimento",
    "formaPagamento",
    "aereoBilhete",
    "selfbook",
    "justificativaMaiorTarifa",
    "canceladoEmitido",
    "nacional",
    "codigoJustificativaMaiorTarifa",
    "observacao",
    "tipoVoo",
    "identificadorIntegracao",
    "identificadorBackOfficeTipoProduto",
    "remarks",
    "statusCancelamento",
    "valorMulta",
    "valorReembolso",
    "dataModificacaoStatusCancelamento",
    "usuarioModificouStatusCancelamento",
    "totalAereo",
    "cancelado",
    "identificadoresIntegracao",
    "reemissao",
    "consolidadora",
    "autoEmissao",
    "importado",
    "online",
    "complementoJustificativaMaiorTarifa",
    "agenteOnline",
    "opcaoRota",
    "pontoVenda",
    "localizadorPreTripGds",
    "credencial",
    "ciaValidadora",
    "milhas",
    "codigoConsultor",
    "nomeConsultor",
    "emailConsultor",
    "nomeTipoProduto",
    "baseTarifaria",
    "agenteCotacao",
    "agenteEmissao",
    "observacoesGerais",
    "tarifaFornecedor",
    "idOperador",
    "nomeUsuarioModificouStatusCancelamento",
    "statusBilhete",
    "dataOrcamento",
    "quantidadeConexao",
    "validadeBilhete",
    "carbono",
    "quantidadeArvores",
    "quantidadeEscala",
    "ordemcompra",
    "tarifaMedia",
    "idCartao",
    "cartaoCp",
    "emailPax",
    "fonePax",
    "rgPax",
    "cpfPax",
    "dataNascimentoPax"
})
public class Aereo {

    protected int id;
    protected String localizador;
    protected Boolean localizadorGds;
    protected String source;
    protected String codigoEmissor;
    protected String nomeEmissor;
    protected String emailEmissor;
    protected String codigoReservador;
    protected String nomeReservador;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVencimento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEmissao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataReserva;
    protected Double menorTarifa;
    protected Double maiorTarifa;
    protected String ciaMenorTarifa;
    protected String codigoFornecedor;
    @XmlElement(nillable = true)
    protected List<Integer> idPassageiroRef;
    protected AereoTarifa aereoTarifa;
    @XmlElement(nillable = true)
    protected List<AereoSeguimento> aereoSeguimento;
    @XmlElement(nillable = true)
    protected List<FormaPagamento> formaPagamento;
    @XmlElement(nillable = true)
    protected List<AereoBilhete> aereoBilhete;
    protected boolean selfbook;
    protected String justificativaMaiorTarifa;
    protected Boolean canceladoEmitido;
    protected Boolean nacional;
    protected String codigoJustificativaMaiorTarifa;
    protected String observacao;
    protected String tipoVoo;
    protected String identificadorIntegracao;
    protected String identificadorBackOfficeTipoProduto;
    protected Remarks remarks;
    protected Integer statusCancelamento;
    protected Double valorMulta;
    protected Double valorReembolso;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataModificacaoStatusCancelamento;
    protected Integer usuarioModificouStatusCancelamento;
    protected Double totalAereo;
    protected boolean cancelado;
    protected IdentificadoresIntegracao identificadoresIntegracao;
    protected Reemissao reemissao;
    protected Consolidadora consolidadora;
    protected boolean autoEmissao;
    protected boolean importado;
    protected boolean online;
    protected String complementoJustificativaMaiorTarifa;
    protected boolean agenteOnline;
    protected boolean opcaoRota;
    protected PontoVendaOrcamento pontoVenda;
    protected String localizadorPreTripGds;
    protected Credencial credencial;
    protected String ciaValidadora;
    protected Integer milhas;
    protected String codigoConsultor;
    protected String nomeConsultor;
    protected String emailConsultor;
    protected String nomeTipoProduto;
    protected String baseTarifaria;
    @XmlSchemaType(name = "string")
    protected Agente agenteCotacao;
    @XmlSchemaType(name = "string")
    protected Agente agenteEmissao;
    protected String observacoesGerais;
    protected String tarifaFornecedor;
    protected String idOperador;
    protected String nomeUsuarioModificouStatusCancelamento;
    @XmlSchemaType(name = "string")
    protected EnumStatusBilhete statusBilhete;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOrcamento;
    protected Integer quantidadeConexao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validadeBilhete;
    protected Double carbono;
    protected Double quantidadeArvores;
    protected Integer quantidadeEscala;
    protected String ordemcompra;
    protected Double tarifaMedia;
    protected String idCartao;
    protected String cartaoCp;
    protected String emailPax;
    protected String fonePax;
    protected String rgPax;
    protected String cpfPax;
    protected String dataNascimentoPax;

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade localizador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizador() {
        return localizador;
    }

    /**
     * Define o valor da propriedade localizador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizador(String value) {
        this.localizador = value;
    }

    /**
     * Obtém o valor da propriedade localizadorGds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalizadorGds() {
        return localizadorGds;
    }

    /**
     * Define o valor da propriedade localizadorGds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalizadorGds(Boolean value) {
        this.localizadorGds = value;
    }

    /**
     * Obtém o valor da propriedade source.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Define o valor da propriedade source.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Obtém o valor da propriedade codigoEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEmissor() {
        return codigoEmissor;
    }

    /**
     * Define o valor da propriedade codigoEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEmissor(String value) {
        this.codigoEmissor = value;
    }

    /**
     * Obtém o valor da propriedade nomeEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEmissor() {
        return nomeEmissor;
    }

    /**
     * Define o valor da propriedade nomeEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEmissor(String value) {
        this.nomeEmissor = value;
    }

    /**
     * Obtém o valor da propriedade emailEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailEmissor() {
        return emailEmissor;
    }

    /**
     * Define o valor da propriedade emailEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailEmissor(String value) {
        this.emailEmissor = value;
    }

    /**
     * Obtém o valor da propriedade codigoReservador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoReservador() {
        return codigoReservador;
    }

    /**
     * Define o valor da propriedade codigoReservador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoReservador(String value) {
        this.codigoReservador = value;
    }

    /**
     * Obtém o valor da propriedade nomeReservador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeReservador() {
        return nomeReservador;
    }

    /**
     * Define o valor da propriedade nomeReservador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeReservador(String value) {
        this.nomeReservador = value;
    }

    /**
     * Obtém o valor da propriedade dataVencimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Define o valor da propriedade dataVencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVencimento(XMLGregorianCalendar value) {
        this.dataVencimento = value;
    }

    /**
     * Obtém o valor da propriedade dataEmissao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Define o valor da propriedade dataEmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissao(XMLGregorianCalendar value) {
        this.dataEmissao = value;
    }

    /**
     * Obtém o valor da propriedade dataReserva.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataReserva() {
        return dataReserva;
    }

    /**
     * Define o valor da propriedade dataReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataReserva(XMLGregorianCalendar value) {
        this.dataReserva = value;
    }

    /**
     * Obtém o valor da propriedade menorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMenorTarifa() {
        return menorTarifa;
    }

    /**
     * Define o valor da propriedade menorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMenorTarifa(Double value) {
        this.menorTarifa = value;
    }

    /**
     * Obtém o valor da propriedade maiorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaiorTarifa() {
        return maiorTarifa;
    }

    /**
     * Define o valor da propriedade maiorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaiorTarifa(Double value) {
        this.maiorTarifa = value;
    }

    /**
     * Obtém o valor da propriedade ciaMenorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiaMenorTarifa() {
        return ciaMenorTarifa;
    }

    /**
     * Define o valor da propriedade ciaMenorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiaMenorTarifa(String value) {
        this.ciaMenorTarifa = value;
    }

    /**
     * Obtém o valor da propriedade codigoFornecedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    /**
     * Define o valor da propriedade codigoFornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFornecedor(String value) {
        this.codigoFornecedor = value;
    }

    /**
     * Gets the value of the idPassageiroRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the idPassageiroRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdPassageiroRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIdPassageiroRef() {
        if (idPassageiroRef == null) {
            idPassageiroRef = new ArrayList<Integer>();
        }
        return this.idPassageiroRef;
    }

    /**
     * Obtém o valor da propriedade aereoTarifa.
     * 
     * @return
     *     possible object is
     *     {@link AereoTarifa }
     *     
     */
    public AereoTarifa getAereoTarifa() {
        return aereoTarifa;
    }

    /**
     * Define o valor da propriedade aereoTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link AereoTarifa }
     *     
     */
    public void setAereoTarifa(AereoTarifa value) {
        this.aereoTarifa = value;
    }

    /**
     * Gets the value of the aereoSeguimento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the aereoSeguimento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAereoSeguimento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AereoSeguimento }
     * 
     * 
     */
    public List<AereoSeguimento> getAereoSeguimento() {
        if (aereoSeguimento == null) {
            aereoSeguimento = new ArrayList<AereoSeguimento>();
        }
        return this.aereoSeguimento;
    }

    /**
     * Gets the value of the formaPagamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the formaPagamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormaPagamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormaPagamento }
     * 
     * 
     */
    public List<FormaPagamento> getFormaPagamento() {
        if (formaPagamento == null) {
            formaPagamento = new ArrayList<FormaPagamento>();
        }
        return this.formaPagamento;
    }

    /**
     * Gets the value of the aereoBilhete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the aereoBilhete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAereoBilhete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AereoBilhete }
     * 
     * 
     */
    public List<AereoBilhete> getAereoBilhete() {
        if (aereoBilhete == null) {
            aereoBilhete = new ArrayList<AereoBilhete>();
        }
        return this.aereoBilhete;
    }

    /**
     * Obtém o valor da propriedade selfbook.
     * 
     */
    public boolean isSelfbook() {
        return selfbook;
    }

    /**
     * Define o valor da propriedade selfbook.
     * 
     */
    public void setSelfbook(boolean value) {
        this.selfbook = value;
    }

    /**
     * Obtém o valor da propriedade justificativaMaiorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaMaiorTarifa() {
        return justificativaMaiorTarifa;
    }

    /**
     * Define o valor da propriedade justificativaMaiorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaMaiorTarifa(String value) {
        this.justificativaMaiorTarifa = value;
    }

    /**
     * Obtém o valor da propriedade canceladoEmitido.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanceladoEmitido() {
        return canceladoEmitido;
    }

    /**
     * Define o valor da propriedade canceladoEmitido.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanceladoEmitido(Boolean value) {
        this.canceladoEmitido = value;
    }

    /**
     * Obtém o valor da propriedade nacional.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNacional() {
        return nacional;
    }

    /**
     * Define o valor da propriedade nacional.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNacional(Boolean value) {
        this.nacional = value;
    }

    /**
     * Obtém o valor da propriedade codigoJustificativaMaiorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoJustificativaMaiorTarifa() {
        return codigoJustificativaMaiorTarifa;
    }

    /**
     * Define o valor da propriedade codigoJustificativaMaiorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoJustificativaMaiorTarifa(String value) {
        this.codigoJustificativaMaiorTarifa = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Obtém o valor da propriedade tipoVoo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVoo() {
        return tipoVoo;
    }

    /**
     * Define o valor da propriedade tipoVoo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVoo(String value) {
        this.tipoVoo = value;
    }

    /**
     * Obtém o valor da propriedade identificadorIntegracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorIntegracao() {
        return identificadorIntegracao;
    }

    /**
     * Define o valor da propriedade identificadorIntegracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorIntegracao(String value) {
        this.identificadorIntegracao = value;
    }

    /**
     * Obtém o valor da propriedade identificadorBackOfficeTipoProduto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackOfficeTipoProduto() {
        return identificadorBackOfficeTipoProduto;
    }

    /**
     * Define o valor da propriedade identificadorBackOfficeTipoProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackOfficeTipoProduto(String value) {
        this.identificadorBackOfficeTipoProduto = value;
    }

    /**
     * Obtém o valor da propriedade remarks.
     * 
     * @return
     *     possible object is
     *     {@link Remarks }
     *     
     */
    public Remarks getRemarks() {
        return remarks;
    }

    /**
     * Define o valor da propriedade remarks.
     * 
     * @param value
     *     allowed object is
     *     {@link Remarks }
     *     
     */
    public void setRemarks(Remarks value) {
        this.remarks = value;
    }

    /**
     * Obtém o valor da propriedade statusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusCancelamento() {
        return statusCancelamento;
    }

    /**
     * Define o valor da propriedade statusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusCancelamento(Integer value) {
        this.statusCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade valorMulta.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorMulta() {
        return valorMulta;
    }

    /**
     * Define o valor da propriedade valorMulta.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorMulta(Double value) {
        this.valorMulta = value;
    }

    /**
     * Obtém o valor da propriedade valorReembolso.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorReembolso() {
        return valorReembolso;
    }

    /**
     * Define o valor da propriedade valorReembolso.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorReembolso(Double value) {
        this.valorReembolso = value;
    }

    /**
     * Obtém o valor da propriedade dataModificacaoStatusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataModificacaoStatusCancelamento() {
        return dataModificacaoStatusCancelamento;
    }

    /**
     * Define o valor da propriedade dataModificacaoStatusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataModificacaoStatusCancelamento(XMLGregorianCalendar value) {
        this.dataModificacaoStatusCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade usuarioModificouStatusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsuarioModificouStatusCancelamento() {
        return usuarioModificouStatusCancelamento;
    }

    /**
     * Define o valor da propriedade usuarioModificouStatusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsuarioModificouStatusCancelamento(Integer value) {
        this.usuarioModificouStatusCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade totalAereo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAereo() {
        return totalAereo;
    }

    /**
     * Define o valor da propriedade totalAereo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAereo(Double value) {
        this.totalAereo = value;
    }

    /**
     * Obtém o valor da propriedade cancelado.
     * 
     */
    public boolean isCancelado() {
        return cancelado;
    }

    /**
     * Define o valor da propriedade cancelado.
     * 
     */
    public void setCancelado(boolean value) {
        this.cancelado = value;
    }

    /**
     * Obtém o valor da propriedade identificadoresIntegracao.
     * 
     * @return
     *     possible object is
     *     {@link IdentificadoresIntegracao }
     *     
     */
    public IdentificadoresIntegracao getIdentificadoresIntegracao() {
        return identificadoresIntegracao;
    }

    /**
     * Define o valor da propriedade identificadoresIntegracao.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificadoresIntegracao }
     *     
     */
    public void setIdentificadoresIntegracao(IdentificadoresIntegracao value) {
        this.identificadoresIntegracao = value;
    }

    /**
     * Obtém o valor da propriedade reemissao.
     * 
     * @return
     *     possible object is
     *     {@link Reemissao }
     *     
     */
    public Reemissao getReemissao() {
        return reemissao;
    }

    /**
     * Define o valor da propriedade reemissao.
     * 
     * @param value
     *     allowed object is
     *     {@link Reemissao }
     *     
     */
    public void setReemissao(Reemissao value) {
        this.reemissao = value;
    }

    /**
     * Obtém o valor da propriedade consolidadora.
     * 
     * @return
     *     possible object is
     *     {@link Consolidadora }
     *     
     */
    public Consolidadora getConsolidadora() {
        return consolidadora;
    }

    /**
     * Define o valor da propriedade consolidadora.
     * 
     * @param value
     *     allowed object is
     *     {@link Consolidadora }
     *     
     */
    public void setConsolidadora(Consolidadora value) {
        this.consolidadora = value;
    }

    /**
     * Obtém o valor da propriedade autoEmissao.
     * 
     */
    public boolean isAutoEmissao() {
        return autoEmissao;
    }

    /**
     * Define o valor da propriedade autoEmissao.
     * 
     */
    public void setAutoEmissao(boolean value) {
        this.autoEmissao = value;
    }

    /**
     * Obtém o valor da propriedade importado.
     * 
     */
    public boolean isImportado() {
        return importado;
    }

    /**
     * Define o valor da propriedade importado.
     * 
     */
    public void setImportado(boolean value) {
        this.importado = value;
    }

    /**
     * Obtém o valor da propriedade online.
     * 
     */
    public boolean isOnline() {
        return online;
    }

    /**
     * Define o valor da propriedade online.
     * 
     */
    public void setOnline(boolean value) {
        this.online = value;
    }

    /**
     * Obtém o valor da propriedade complementoJustificativaMaiorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoJustificativaMaiorTarifa() {
        return complementoJustificativaMaiorTarifa;
    }

    /**
     * Define o valor da propriedade complementoJustificativaMaiorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoJustificativaMaiorTarifa(String value) {
        this.complementoJustificativaMaiorTarifa = value;
    }

    /**
     * Obtém o valor da propriedade agenteOnline.
     * 
     */
    public boolean isAgenteOnline() {
        return agenteOnline;
    }

    /**
     * Define o valor da propriedade agenteOnline.
     * 
     */
    public void setAgenteOnline(boolean value) {
        this.agenteOnline = value;
    }

    /**
     * Obtém o valor da propriedade opcaoRota.
     * 
     */
    public boolean isOpcaoRota() {
        return opcaoRota;
    }

    /**
     * Define o valor da propriedade opcaoRota.
     * 
     */
    public void setOpcaoRota(boolean value) {
        this.opcaoRota = value;
    }

    /**
     * Obtém o valor da propriedade pontoVenda.
     * 
     * @return
     *     possible object is
     *     {@link PontoVendaOrcamento }
     *     
     */
    public PontoVendaOrcamento getPontoVenda() {
        return pontoVenda;
    }

    /**
     * Define o valor da propriedade pontoVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link PontoVendaOrcamento }
     *     
     */
    public void setPontoVenda(PontoVendaOrcamento value) {
        this.pontoVenda = value;
    }

    /**
     * Obtém o valor da propriedade localizadorPreTripGds.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizadorPreTripGds() {
        return localizadorPreTripGds;
    }

    /**
     * Define o valor da propriedade localizadorPreTripGds.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizadorPreTripGds(String value) {
        this.localizadorPreTripGds = value;
    }

    /**
     * Obtém o valor da propriedade credencial.
     * 
     * @return
     *     possible object is
     *     {@link Credencial }
     *     
     */
    public Credencial getCredencial() {
        return credencial;
    }

    /**
     * Define o valor da propriedade credencial.
     * 
     * @param value
     *     allowed object is
     *     {@link Credencial }
     *     
     */
    public void setCredencial(Credencial value) {
        this.credencial = value;
    }

    /**
     * Obtém o valor da propriedade ciaValidadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiaValidadora() {
        return ciaValidadora;
    }

    /**
     * Define o valor da propriedade ciaValidadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiaValidadora(String value) {
        this.ciaValidadora = value;
    }

    /**
     * Obtém o valor da propriedade milhas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMilhas() {
        return milhas;
    }

    /**
     * Define o valor da propriedade milhas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMilhas(Integer value) {
        this.milhas = value;
    }

    /**
     * Obtém o valor da propriedade codigoConsultor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoConsultor() {
        return codigoConsultor;
    }

    /**
     * Define o valor da propriedade codigoConsultor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoConsultor(String value) {
        this.codigoConsultor = value;
    }

    /**
     * Obtém o valor da propriedade nomeConsultor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeConsultor() {
        return nomeConsultor;
    }

    /**
     * Define o valor da propriedade nomeConsultor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeConsultor(String value) {
        this.nomeConsultor = value;
    }

    /**
     * Obtém o valor da propriedade emailConsultor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailConsultor() {
        return emailConsultor;
    }

    /**
     * Define o valor da propriedade emailConsultor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailConsultor(String value) {
        this.emailConsultor = value;
    }

    /**
     * Obtém o valor da propriedade nomeTipoProduto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTipoProduto() {
        return nomeTipoProduto;
    }

    /**
     * Define o valor da propriedade nomeTipoProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTipoProduto(String value) {
        this.nomeTipoProduto = value;
    }

    /**
     * Obtém o valor da propriedade baseTarifaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTarifaria() {
        return baseTarifaria;
    }

    /**
     * Define o valor da propriedade baseTarifaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTarifaria(String value) {
        this.baseTarifaria = value;
    }

    /**
     * Obtém o valor da propriedade agenteCotacao.
     * 
     * @return
     *     possible object is
     *     {@link Agente }
     *     
     */
    public Agente getAgenteCotacao() {
        return agenteCotacao;
    }

    /**
     * Define o valor da propriedade agenteCotacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Agente }
     *     
     */
    public void setAgenteCotacao(Agente value) {
        this.agenteCotacao = value;
    }

    /**
     * Obtém o valor da propriedade agenteEmissao.
     * 
     * @return
     *     possible object is
     *     {@link Agente }
     *     
     */
    public Agente getAgenteEmissao() {
        return agenteEmissao;
    }

    /**
     * Define o valor da propriedade agenteEmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link Agente }
     *     
     */
    public void setAgenteEmissao(Agente value) {
        this.agenteEmissao = value;
    }

    /**
     * Obtém o valor da propriedade observacoesGerais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacoesGerais() {
        return observacoesGerais;
    }

    /**
     * Define o valor da propriedade observacoesGerais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacoesGerais(String value) {
        this.observacoesGerais = value;
    }

    /**
     * Obtém o valor da propriedade tarifaFornecedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarifaFornecedor() {
        return tarifaFornecedor;
    }

    /**
     * Define o valor da propriedade tarifaFornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarifaFornecedor(String value) {
        this.tarifaFornecedor = value;
    }

    /**
     * Obtém o valor da propriedade idOperador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOperador() {
        return idOperador;
    }

    /**
     * Define o valor da propriedade idOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOperador(String value) {
        this.idOperador = value;
    }

    /**
     * Obtém o valor da propriedade nomeUsuarioModificouStatusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeUsuarioModificouStatusCancelamento() {
        return nomeUsuarioModificouStatusCancelamento;
    }

    /**
     * Define o valor da propriedade nomeUsuarioModificouStatusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeUsuarioModificouStatusCancelamento(String value) {
        this.nomeUsuarioModificouStatusCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade statusBilhete.
     * 
     * @return
     *     possible object is
     *     {@link EnumStatusBilhete }
     *     
     */
    public EnumStatusBilhete getStatusBilhete() {
        return statusBilhete;
    }

    /**
     * Define o valor da propriedade statusBilhete.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumStatusBilhete }
     *     
     */
    public void setStatusBilhete(EnumStatusBilhete value) {
        this.statusBilhete = value;
    }

    /**
     * Obtém o valor da propriedade dataOrcamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOrcamento() {
        return dataOrcamento;
    }

    /**
     * Define o valor da propriedade dataOrcamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOrcamento(XMLGregorianCalendar value) {
        this.dataOrcamento = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeConexao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadeConexao() {
        return quantidadeConexao;
    }

    /**
     * Define o valor da propriedade quantidadeConexao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadeConexao(Integer value) {
        this.quantidadeConexao = value;
    }

    /**
     * Obtém o valor da propriedade validadeBilhete.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidadeBilhete() {
        return validadeBilhete;
    }

    /**
     * Define o valor da propriedade validadeBilhete.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidadeBilhete(XMLGregorianCalendar value) {
        this.validadeBilhete = value;
    }

    /**
     * Obtém o valor da propriedade carbono.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCarbono() {
        return carbono;
    }

    /**
     * Define o valor da propriedade carbono.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCarbono(Double value) {
        this.carbono = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeArvores.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantidadeArvores() {
        return quantidadeArvores;
    }

    /**
     * Define o valor da propriedade quantidadeArvores.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantidadeArvores(Double value) {
        this.quantidadeArvores = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeEscala.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadeEscala() {
        return quantidadeEscala;
    }

    /**
     * Define o valor da propriedade quantidadeEscala.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadeEscala(Integer value) {
        this.quantidadeEscala = value;
    }

    /**
     * Obtém o valor da propriedade ordemcompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdemcompra() {
        return ordemcompra;
    }

    /**
     * Define o valor da propriedade ordemcompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdemcompra(String value) {
        this.ordemcompra = value;
    }

    /**
     * Obtém o valor da propriedade tarifaMedia.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTarifaMedia() {
        return tarifaMedia;
    }

    /**
     * Define o valor da propriedade tarifaMedia.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTarifaMedia(Double value) {
        this.tarifaMedia = value;
    }

    /**
     * Obtém o valor da propriedade idCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCartao() {
        return idCartao;
    }

    /**
     * Define o valor da propriedade idCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCartao(String value) {
        this.idCartao = value;
    }

    /**
     * Obtém o valor da propriedade cartaoCp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartaoCp() {
        return cartaoCp;
    }

    /**
     * Define o valor da propriedade cartaoCp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartaoCp(String value) {
        this.cartaoCp = value;
    }

    /**
     * Obtém o valor da propriedade emailPax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPax() {
        return emailPax;
    }

    /**
     * Define o valor da propriedade emailPax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPax(String value) {
        this.emailPax = value;
    }

    /**
     * Obtém o valor da propriedade fonePax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFonePax() {
        return fonePax;
    }

    /**
     * Define o valor da propriedade fonePax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFonePax(String value) {
        this.fonePax = value;
    }

    /**
     * Obtém o valor da propriedade rgPax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgPax() {
        return rgPax;
    }

    /**
     * Define o valor da propriedade rgPax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgPax(String value) {
        this.rgPax = value;
    }

    /**
     * Obtém o valor da propriedade cpfPax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfPax() {
        return cpfPax;
    }

    /**
     * Define o valor da propriedade cpfPax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfPax(String value) {
        this.cpfPax = value;
    }

    /**
     * Obtém o valor da propriedade dataNascimentoPax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataNascimentoPax() {
        return dataNascimentoPax;
    }

    /**
     * Define o valor da propriedade dataNascimentoPax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataNascimentoPax(String value) {
        this.dataNascimentoPax = value;
    }

}
