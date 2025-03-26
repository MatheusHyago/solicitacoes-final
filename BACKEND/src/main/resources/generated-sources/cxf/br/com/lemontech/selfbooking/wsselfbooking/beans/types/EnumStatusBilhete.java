
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de enumStatusBilhete.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="enumStatusBilhete"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NAO_UTILIZADO"/&gt;
 *     &lt;enumeration value="UTILIZADO"/&gt;
 *     &lt;enumeration value="INDETERMINADO"/&gt;
 *     &lt;enumeration value="NAO_LOCALIZADO"/&gt;
 *     &lt;enumeration value="ACESSO_RESTRITO"/&gt;
 *     &lt;enumeration value="REEMBOLSO"/&gt;
 *     &lt;enumeration value="CREDITO_CIA_AEREA"/&gt;
 *     &lt;enumeration value="EM_ABERTO"/&gt;
 *     &lt;enumeration value="NAO_REEMBOLSAVEL"/&gt;
 *     &lt;enumeration value="SEM_CREDITO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumStatusBilhete")
@XmlEnum
public enum EnumStatusBilhete {

    NAO_UTILIZADO,
    UTILIZADO,
    INDETERMINADO,
    NAO_LOCALIZADO,
    ACESSO_RESTRITO,
    REEMBOLSO,
    CREDITO_CIA_AEREA,
    EM_ABERTO,
    NAO_REEMBOLSAVEL,
    SEM_CREDITO;

    public String value() {
        return name();
    }

    public static EnumStatusBilhete fromValue(String v) {
        return valueOf(v);
    }

}
