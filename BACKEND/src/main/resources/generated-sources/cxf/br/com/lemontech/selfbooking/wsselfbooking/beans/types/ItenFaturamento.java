
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de itenFaturamento.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="itenFaturamento"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALIMENTOS_BEBIDAS_NAO_ALCOOLICAS"/&gt;
 *     &lt;enumeration value="CAFE_DA_MANHA"/&gt;
 *     &lt;enumeration value="DIARIAS"/&gt;
 *     &lt;enumeration value="LAVANDERIA"/&gt;
 *     &lt;enumeration value="LIGACOES_TELEFONICAS"/&gt;
 *     &lt;enumeration value="TAXAS"/&gt;
 *     &lt;enumeration value="TODAS_DESPESAS_EXCETO_BEBIDAS"/&gt;
 *     &lt;enumeration value="TODAS_DESPESA"/&gt;
 *     &lt;enumeration value="TAXA_TURISMO"/&gt;
 *     &lt;enumeration value="AGUA"/&gt;
 *     &lt;enumeration value="ESTACIONAMENTO"/&gt;
 *     &lt;enumeration value="HORAS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "itenFaturamento")
@XmlEnum
public enum ItenFaturamento {

    ALIMENTOS_BEBIDAS_NAO_ALCOOLICAS,
    CAFE_DA_MANHA,
    DIARIAS,
    LAVANDERIA,
    LIGACOES_TELEFONICAS,
    TAXAS,
    TODAS_DESPESAS_EXCETO_BEBIDAS,
    TODAS_DESPESA,
    TAXA_TURISMO,
    AGUA,
    ESTACIONAMENTO,
    HORAS;

    public String value() {
        return name();
    }

    public static ItenFaturamento fromValue(String v) {
        return valueOf(v);
    }

}
