
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoIntegracao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoIntegracao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONCLUSAO"/&gt;
 *     &lt;enumeration value="CANCELAMENTO"/&gt;
 *     &lt;enumeration value="PENDENCIA_APROVACAO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoIntegracao")
@XmlEnum
public enum TipoIntegracao {

    CONCLUSAO,
    CANCELAMENTO,
    PENDENCIA_APROVACAO;

    public String value() {
        return name();
    }

    public static TipoIntegracao fromValue(String v) {
        return valueOf(v);
    }

}
