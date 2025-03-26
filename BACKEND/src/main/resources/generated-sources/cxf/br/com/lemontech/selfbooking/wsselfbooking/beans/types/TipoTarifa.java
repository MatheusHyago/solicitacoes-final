
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoTarifa.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoTarifa"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIARIA"/&gt;
 *     &lt;enumeration value="FIM_DE_SEMANA"/&gt;
 *     &lt;enumeration value="MENSAL"/&gt;
 *     &lt;enumeration value="PACOTE"/&gt;
 *     &lt;enumeration value="SEMANAL"/&gt;
 *     &lt;enumeration value="HORA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoTarifa")
@XmlEnum
public enum TipoTarifa {

    DIARIA,
    FIM_DE_SEMANA,
    MENSAL,
    PACOTE,
    SEMANAL,
    HORA;

    public String value() {
        return name();
    }

    public static TipoTarifa fromValue(String v) {
        return valueOf(v);
    }

}
