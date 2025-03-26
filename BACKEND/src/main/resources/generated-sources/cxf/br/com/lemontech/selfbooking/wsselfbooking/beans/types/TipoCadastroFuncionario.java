
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoCadastroFuncionario.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoCadastroFuncionario"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SELF_BOOKING"/&gt;
 *     &lt;enumeration value="FRONT_OFFICE"/&gt;
 *     &lt;enumeration value="FRONT_SELF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoCadastroFuncionario")
@XmlEnum
public enum TipoCadastroFuncionario {

    SELF_BOOKING,
    FRONT_OFFICE,
    FRONT_SELF;

    public String value() {
        return name();
    }

    public static TipoCadastroFuncionario fromValue(String v) {
        return valueOf(v);
    }

}
