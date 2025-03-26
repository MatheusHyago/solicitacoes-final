
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de enumOrigemSolicitacao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="enumOrigemSolicitacao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WEB"/&gt;
 *     &lt;enumeration value="APP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumOrigemSolicitacao")
@XmlEnum
public enum EnumOrigemSolicitacao {

    WEB,
    APP;

    public String value() {
        return name();
    }

    public static EnumOrigemSolicitacao fromValue(String v) {
        return valueOf(v);
    }

}
