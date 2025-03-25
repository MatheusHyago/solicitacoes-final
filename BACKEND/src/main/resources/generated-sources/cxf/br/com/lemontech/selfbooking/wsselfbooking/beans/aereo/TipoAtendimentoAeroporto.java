
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoAtendimentoAeroporto.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoAtendimentoAeroporto"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMBARQUE"/&gt;
 *     &lt;enumeration value="DESEMBARQUE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoAtendimentoAeroporto")
@XmlEnum
public enum TipoAtendimentoAeroporto {

    EMBARQUE,
    DESEMBARQUE;

    public String value() {
        return name();
    }

    public static TipoAtendimentoAeroporto fromValue(String v) {
        return valueOf(v);
    }

}
