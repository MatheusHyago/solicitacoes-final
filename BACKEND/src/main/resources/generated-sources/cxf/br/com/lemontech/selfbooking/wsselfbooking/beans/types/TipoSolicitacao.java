
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoSolicitacao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoSolicitacao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TODOS"/&gt;
 *     &lt;enumeration value="CORPORATIVO"/&gt;
 *     &lt;enumeration value="EXPENSE"/&gt;
 *     &lt;enumeration value="INCENTIVO"/&gt;
 *     &lt;enumeration value="TREINAMENTO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoSolicitacao")
@XmlEnum
public enum TipoSolicitacao {

    TODOS,
    CORPORATIVO,
    EXPENSE,
    INCENTIVO,
    TREINAMENTO;

    public String value() {
        return name();
    }

    public static TipoSolicitacao fromValue(String v) {
        return valueOf(v);
    }

}
