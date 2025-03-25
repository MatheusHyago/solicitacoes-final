
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoDocumento.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoDocumento"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MATRICULA"/&gt;
 *     &lt;enumeration value="CPF"/&gt;
 *     &lt;enumeration value="RG"/&gt;
 *     &lt;enumeration value="PASSAPORTE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoDocumento")
@XmlEnum
public enum TipoDocumento {

    MATRICULA,
    CPF,
    RG,
    PASSAPORTE;

    public String value() {
        return name();
    }

    public static TipoDocumento fromValue(String v) {
        return valueOf(v);
    }

}
