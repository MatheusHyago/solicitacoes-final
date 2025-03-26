
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de produtoAprovacao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="produtoAprovacao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TODOS"/&gt;
 *     &lt;enumeration value="AEREO"/&gt;
 *     &lt;enumeration value="HOTEL"/&gt;
 *     &lt;enumeration value="CARRO"/&gt;
 *     &lt;enumeration value="OUTRO"/&gt;
 *     &lt;enumeration value="TRASLADO"/&gt;
 *     &lt;enumeration value="SEGURO"/&gt;
 *     &lt;enumeration value="RODOVIARIO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "produtoAprovacao")
@XmlEnum
public enum ProdutoAprovacao {

    TODOS,
    AEREO,
    HOTEL,
    CARRO,
    OUTRO,
    TRASLADO,
    SEGURO,
    RODOVIARIO;

    public String value() {
        return name();
    }

    public static ProdutoAprovacao fromValue(String v) {
        return valueOf(v);
    }

}
