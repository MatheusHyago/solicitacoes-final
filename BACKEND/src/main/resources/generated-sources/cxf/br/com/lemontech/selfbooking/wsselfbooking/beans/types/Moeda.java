
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de moeda.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="moeda"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="NUC"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="JPY"/&gt;
 *     &lt;enumeration value="CNY"/&gt;
 *     &lt;enumeration value="KHR"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="MXN"/&gt;
 *     &lt;enumeration value="COP"/&gt;
 *     &lt;enumeration value="AFA"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="SGD"/&gt;
 *     &lt;enumeration value="PYG"/&gt;
 *     &lt;enumeration value="CLP"/&gt;
 *     &lt;enumeration value="CHF"/&gt;
 *     &lt;enumeration value="AED"/&gt;
 *     &lt;enumeration value="SEK"/&gt;
 *     &lt;enumeration value="UAH"/&gt;
 *     &lt;enumeration value="BOB"/&gt;
 *     &lt;enumeration value="NGN"/&gt;
 *     &lt;enumeration value="ZAR"/&gt;
 *     &lt;enumeration value="DKK"/&gt;
 *     &lt;enumeration value="AZM"/&gt;
 *     &lt;enumeration value="RUB"/&gt;
 *     &lt;enumeration value="HKD"/&gt;
 *     &lt;enumeration value="KRW"/&gt;
 *     &lt;enumeration value="CZK"/&gt;
 *     &lt;enumeration value="INR"/&gt;
 *     &lt;enumeration value="AUD"/&gt;
 *     &lt;enumeration value="THB"/&gt;
 *     &lt;enumeration value="BND"/&gt;
 *     &lt;enumeration value="TRY"/&gt;
 *     &lt;enumeration value="NOK"/&gt;
 *     &lt;enumeration value="MZN"/&gt;
 *     &lt;enumeration value="BMD"/&gt;
 *     &lt;enumeration value="MYR"/&gt;
 *     &lt;enumeration value="NZD"/&gt;
 *     &lt;enumeration value="QAR"/&gt;
 *     &lt;enumeration value="OMR"/&gt;
 *     &lt;enumeration value="EGP"/&gt;
 *     &lt;enumeration value="IDR"/&gt;
 *     &lt;enumeration value="SAR"/&gt;
 *     &lt;enumeration value="XAF"/&gt;
 *     &lt;enumeration value="MAD"/&gt;
 *     &lt;enumeration value="NAD"/&gt;
 *     &lt;enumeration value="TND"/&gt;
 *     &lt;enumeration value="TWD"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="BDT"/&gt;
 *     &lt;enumeration value="AWG"/&gt;
 *     &lt;enumeration value="GYD"/&gt;
 *     &lt;enumeration value="PHP"/&gt;
 *     &lt;enumeration value="XOF"/&gt;
 *     &lt;enumeration value="UYU"/&gt;
 *     &lt;enumeration value="GTQ"/&gt;
 *     &lt;enumeration value="HNL"/&gt;
 *     &lt;enumeration value="NIO"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="PAB"/&gt;
 *     &lt;enumeration value="VEF"/&gt;
 *     &lt;enumeration value="ECS"/&gt;
 *     &lt;enumeration value="CUP"/&gt;
 *     &lt;enumeration value="CUC"/&gt;
 *     &lt;enumeration value="MRU"/&gt;
 *     &lt;enumeration value="MUR"/&gt;
 *     &lt;enumeration value="RMB"/&gt;
 *     &lt;enumeration value="ISK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "moeda")
@XmlEnum
public enum Moeda {

    ARS,
    BRL,
    USD,
    NUC,
    EUR,
    GBP,
    JPY,
    CNY,
    KHR,
    PLN,
    CAD,
    MXN,
    COP,
    AFA,
    PEN,
    SGD,
    PYG,
    CLP,
    CHF,
    AED,
    SEK,
    UAH,
    BOB,
    NGN,
    ZAR,
    DKK,
    AZM,
    RUB,
    HKD,
    KRW,
    CZK,
    INR,
    AUD,
    THB,
    BND,
    TRY,
    NOK,
    MZN,
    BMD,
    MYR,
    NZD,
    QAR,
    OMR,
    EGP,
    IDR,
    SAR,
    XAF,
    MAD,
    NAD,
    TND,
    TWD,
    HUF,
    BDT,
    AWG,
    GYD,
    PHP,
    XOF,
    UYU,
    GTQ,
    HNL,
    NIO,
    CRC,
    PAB,
    VEF,
    ECS,
    CUP,
    CUC,
    MRU,
    MUR,
    RMB,
    ISK;

    public String value() {
        return name();
    }

    public static Moeda fromValue(String v) {
        return valueOf(v);
    }

}
