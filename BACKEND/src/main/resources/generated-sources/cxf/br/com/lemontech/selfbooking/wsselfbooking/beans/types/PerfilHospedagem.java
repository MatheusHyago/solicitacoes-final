
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de perfilHospedagem.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="perfilHospedagem"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SIMPLES"/&gt;
 *     &lt;enumeration value="MEDIO_CONFORTO"/&gt;
 *     &lt;enumeration value="CONFORTAVEL"/&gt;
 *     &lt;enumeration value="MUITO_CONFORTAVEL"/&gt;
 *     &lt;enumeration value="LUXO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "perfilHospedagem")
@XmlEnum
public enum PerfilHospedagem {

    SIMPLES,
    MEDIO_CONFORTO,
    CONFORTAVEL,
    MUITO_CONFORTAVEL,
    LUXO;

    public String value() {
        return name();
    }

    public static PerfilHospedagem fromValue(String v) {
        return valueOf(v);
    }

}
