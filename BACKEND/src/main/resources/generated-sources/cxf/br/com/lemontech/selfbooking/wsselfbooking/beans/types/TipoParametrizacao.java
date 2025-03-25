
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoParametrizacao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoParametrizacao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SOLICITACAO"/&gt;
 *     &lt;enumeration value="APROVACAO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoParametrizacao")
@XmlEnum
public enum TipoParametrizacao {

    SOLICITACAO,
    APROVACAO;

    public String value() {
        return name();
    }

    public static TipoParametrizacao fromValue(String v) {
        return valueOf(v);
    }

}
