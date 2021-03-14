/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftiuksw.serviceskamus.services;

import com.ftiuksw.serviceskamus.models.TranslateResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author JESSI
 */
@Service
public class TranslateService {

    private static final Logger log = LoggerFactory.getLogger(TranslateService.class.getName());

    @Autowired
    private RestTemplate restTemplate;
    
    public HashMap<String, String> countrycode = new HashMap<>();

    public TranslateService() {
        countrycode.put("Afrikaans", "af-ZA");
        countrycode.put("Albanian", "sq-AL");
        countrycode.put("Amharic", "am-ET");
        countrycode.put("Arabic", "ar-SA");
        countrycode.put("Armenian", "hy-AM");
        countrycode.put("Azerbaijani", "az-AZ");
        countrycode.put("Bajan", "bjs-BB");
        countrycode.put("BalkanGipsy", "rm-RO");
        countrycode.put("Basque", "eu-ES");
        countrycode.put("Bemba", "bem-ZM");
        countrycode.put("Bengali", "bn-IN");
        countrycode.put("Bielarus", "be-BY");
        countrycode.put("Bislama", "bi-VU");
        countrycode.put("Bosnian", "bs-BA");
        countrycode.put("Breton", "br-FR");
        countrycode.put("Bulgarian", "bg-BG");
        countrycode.put("Burmese", "my-MM");
        countrycode.put("Catalan", "ca-ES");
        countrycode.put("Cebuano", "cb-PH");
        countrycode.put("Chamorro", "cha-GU");
        countrycode.put("Chinese(Simplified)", "zh-CN");
        countrycode.put("ChineseTraditional", "zh-TW");
        countrycode.put("Comorian(Ngazidja)", "zdj-KM");
        countrycode.put("Coptic", "cop-EG");
        countrycode.put("CreoleEnglish(AntiguaandBarbuda)", "aig-AG");
        countrycode.put("CreoleEnglish(Bahamas)", "bah-BS");
        countrycode.put("CreoleEnglish(Grenadian)", "gcl-GD");
        countrycode.put("CreoleEnglish(Guyanese)", "gyn-GY");
        countrycode.put("CreoleEnglish(Jamaican)", "jam-JM");
        countrycode.put("CreoleEnglish(Vincentian)", "svc-VC");
        countrycode.put("CreoleEnglish(VirginIslands)", "vic-US");
        countrycode.put("CreoleFrench(Haitian)", "ht-HT");
        countrycode.put("CreoleFrench(SaintLucian)", "acf-LC");
        countrycode.put("CreoleFrench(Seselwa)", "crs-SC");
        countrycode.put("CreolePortuguese(UpperGuinea)", "pov-GW");
        countrycode.put("Croatian", "hr-HR");
        countrycode.put("Czech", "cs-CZ");
        countrycode.put("Danish", "da-DK");
        countrycode.put("Dutch", "nl-NL");
        countrycode.put("Dzongkha", "dzo-BT");
        countrycode.put("English", "en-GB");
        countrycode.put("Esperanto", "eo-EU");
        countrycode.put("Estonian", "et-EE");
        countrycode.put("Fanagalo", "fn-FNG");
        countrycode.put("Faroese", "fo-FO");
        countrycode.put("Finnish", "fi-FI");
        countrycode.put("French", "fr-FR");
        countrycode.put("Galician", "gl-ES");
        countrycode.put("Georgian", "ka-GE");
        countrycode.put("German", "de-DE");
        countrycode.put("Greek", "el-GR");
        countrycode.put("Greek(Classical)", "grc-GR");
        countrycode.put("Gujarati", "gu-IN");
        countrycode.put("Hausa", "ha-NE");
        countrycode.put("Hawaiian", "haw-US");
        countrycode.put("Hebrew", "he-IL");
        countrycode.put("Hindi", "hi-IN");
        countrycode.put("Hungarian", "hu-HU");
        countrycode.put("Icelandic", "is-IS");
        countrycode.put("Indonesian", "id-ID");
        countrycode.put("Inuktitut(Greenlandic)", "kal-GL");
        countrycode.put("IrishGaelic", "ga-IE");
        countrycode.put("Italian", "it-IT");
        countrycode.put("Japanese", "ja-JA");
        countrycode.put("Javanese", "jv-ID");
        countrycode.put("Kabuverdianu", "kea-CV");
        countrycode.put("Kabylian", "kab-DZ");
        countrycode.put("Kannada", "kn-IN");
        countrycode.put("Kazakh", "kk-KZ");
        countrycode.put("Khmer", "km-KM");
        countrycode.put("Kinyarwanda", "rw-RW");
        countrycode.put("Kirundi", "run-RN");
        countrycode.put("Korean", "ko-KR");
        countrycode.put("Kurdish", "ku-TR");
        countrycode.put("KurdishSorani", "ku-CKB");
        countrycode.put("Kyrgyz", "ky-KG");
        countrycode.put("Lao", "lo-LA");
        countrycode.put("Latin", "la-VA");
        countrycode.put("Latvian", "lv-LV");
        countrycode.put("Lithuanian", "lt-LT");
        countrycode.put("Luxembourgish", "lb-LU");
        countrycode.put("Macedonian", "mk-MK");
        countrycode.put("Malagasy", "mg-MG");
        countrycode.put("Malay", "ms-MY");
        countrycode.put("Maldivian", "div-MV");
        countrycode.put("Maltese", "mt-MT");
        countrycode.put("ManxGaelic", "gv-IM");
        countrycode.put("Maori", "mi-NZ");
        countrycode.put("Marshallese", "mh-MH");
        countrycode.put("Mende", "men-SL");
        countrycode.put("Mongolian", "mn-MN");
        countrycode.put("Morisyen", "mfe-MU");
        countrycode.put("Nepali", "ne-NP");
        countrycode.put("Niuean", "niu-NU");
        countrycode.put("Norwegian", "no-NO");
        countrycode.put("Nyanja", "ny-MW");
        countrycode.put("Pakistani", "ur-PK");
        countrycode.put("Palauan", "pau-PW");
        countrycode.put("Panjabi", "pa-IN");
        countrycode.put("Papiamentu", "pap-CW");
        countrycode.put("Pashto", "ps-PK");
        countrycode.put("Persian", "fa-IR");
        countrycode.put("Pijin", "pis-SB");
        countrycode.put("Polish", "pl-PL");
        countrycode.put("Portuguese", "pt-PT");
        countrycode.put("Potawatomi", "pot-US");
        countrycode.put("Quechua", "qu-PE");
        countrycode.put("Romanian", "ro-RO");
        countrycode.put("Russian", "ru-RU");
        countrycode.put("Samoan", "smo-WS");
        countrycode.put("Sango", "sg-CF");
        countrycode.put("ScotsGaelic", "gd-GB");
        countrycode.put("Serbian", "sr-RS");
        countrycode.put("Shona", "sna-ZW");
        countrycode.put("Sinhala", "si-LK");
        countrycode.put("Slovak", "sk-SK");
        countrycode.put("Slovenian", "sl-SI");
        countrycode.put("Somali", "so-SO");
        countrycode.put("Sotho,Southern", "nso-ZA");
        countrycode.put("Spanish", "es-ES");
        countrycode.put("SrananTongo", "srn-SR");
        countrycode.put("Swahili", "sw-SZ");
        countrycode.put("Swedish", "sv-SE");
        countrycode.put("SwissGerman", "de-CH");
        countrycode.put("Syriac(Aramaic)", "syc-TR");
        countrycode.put("Tagalog", "tl-PH");
        countrycode.put("Tajik", "tg-TJ");
        countrycode.put("Tamashek(Tuareg)", "tmh-DZ");
        countrycode.put("Tamil", "ta-LK");
        countrycode.put("Telugu", "te-IN");
        countrycode.put("Tetum", "tet-TL");
        countrycode.put("Thai", "th-TH");
        countrycode.put("Tibetan", "bod-CN");
        countrycode.put("Tigrinya", "ti-TI");
        countrycode.put("TokPisin", "tpi-PG");
        countrycode.put("Tokelauan", "tkl-TK");
        countrycode.put("Tongan", "ton-TO");
        countrycode.put("Tswana", "tn-BW");
        countrycode.put("Turkish", "tr-TR");
        countrycode.put("Turkmen", "tk-TM");
        countrycode.put("Tuvaluan", "tvl-TV");
        countrycode.put("Ukrainian", "uk-UA");
        countrycode.put("Uma", "ppk-ID");
        countrycode.put("Uzbek", "uz-UZ");
        countrycode.put("Vietnamese", "vi-VN");
        countrycode.put("Wallisian", "wls-WF");
        countrycode.put("Welsh", "cy-GB");
        countrycode.put("Wolof", "wo-SN");
        countrycode.put("Xhosa", "xh-ZA");
        countrycode.put("Yiddish", "yi-YD");
        countrycode.put("Zulu", "zu-ZA");

    }

    
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
            return builder.build();
    }
    
    public String coba() {
        TranslateResult quote = restTemplate.getForObject("https://api.mymemory.translated.net/get?q=Hello%20World!&langpair=en|it", TranslateResult.class);
        log.info(quote.toString());
        String response = quote.getResponseData().getTranslatedText();
        return response;
    }
    
    public String translate( String from, String to, String sentence){
        String from_code = countrycode.get(from);
        String to_code = countrycode.get(to);
//        String modified_sentence = sentence.replace(" ", "%20");
        String url = "https://api.mymemory.translated.net/get?q="+sentence+"&langpair="+from_code+"|"+to_code+'"';
        TranslateResult result = restTemplate.getForObject(url, TranslateResult.class);
        log.info(result.toString());
        String response = result.getResponseData().getTranslatedText().replace("%20", " ");
        return response;
    
    }
    
    public List<String> listlanguage (){
        return new ArrayList<String>(countrycode.keySet());
    }

}
