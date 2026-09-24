package com.bytedance.sdk.component.adexpress.dynamic.p119ka;

import com.bytedance.sdk.component.adexpress.C2490ka;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11744X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.p300io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ka.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2470di {
    private int aac;

    /* JADX INFO: renamed from: ac */
    private String f6698ac;
    private int adz;
    private int ajz;
    private JSONObject akr;
    private int amj;

    /* JADX INFO: renamed from: aw */
    private String f6699aw;

    /* JADX INFO: renamed from: ay */
    private String f6700ay;
    private int bfa;
    private String bgr;
    private int bnj;

    /* JADX INFO: renamed from: bu */
    private String f6701bu;
    private boolean bzf;
    private boolean che;

    /* JADX INFO: renamed from: co */
    private double f6702co;

    /* JADX INFO: renamed from: de */
    private JSONObject f6703de;

    /* JADX INFO: renamed from: di */
    private float f6704di;

    /* JADX INFO: renamed from: dw */
    private double f6705dw;
    private String dzy;

    /* JADX INFO: renamed from: eb */
    private int f6706eb;
    private int eqw;

    /* JADX INFO: renamed from: eu */
    private JSONObject f6707eu;
    private int evm;
    private int ezp;

    /* JADX INFO: renamed from: fb */
    private int f6708fb;

    /* JADX INFO: renamed from: fe */
    private int f6709fe;
    private double feb;

    /* JADX INFO: renamed from: fi */
    private boolean f6710fi;

    /* JADX INFO: renamed from: fn */
    private String f6711fn;

    /* JADX INFO: renamed from: fr */
    private boolean f6712fr;
    private String gcp;
    private String hcw;

    /* JADX INFO: renamed from: hd */
    private int f6713hd;
    private int hpn;
    private List<C2477ri> hws;

    /* JADX INFO: renamed from: id */
    private int f6714id;

    /* JADX INFO: renamed from: ig */
    private int f6715ig;
    private int igq;
    private String ihz;

    /* JADX INFO: renamed from: ik */
    private float f6716ik;
    private boolean iph;
    private float jbs;

    /* JADX INFO: renamed from: jc */
    private int f6717jc;

    /* JADX INFO: renamed from: jg */
    private String f6718jg;

    /* JADX INFO: renamed from: jm */
    private int f6719jm;
    private int jxw;

    /* JADX INFO: renamed from: ka */
    private float f6720ka;

    /* JADX INFO: renamed from: kt */
    private int f6721kt;

    /* JADX INFO: renamed from: lr */
    private float f6722lr;
    private String luy;

    /* JADX INFO: renamed from: mj */
    private float f6723mj;
    private double nbc;

    /* JADX INFO: renamed from: nd */
    private int f6724nd;

    /* JADX INFO: renamed from: nh */
    private int f6725nh;

    /* JADX INFO: renamed from: nr */
    private String f6726nr;

    /* JADX INFO: renamed from: oh */
    private String f6727oh;
    private String ory;

    /* JADX INFO: renamed from: pc */
    private int f6728pc;

    /* JADX INFO: renamed from: pu */
    private boolean f6729pu;

    /* JADX INFO: renamed from: pv */
    private boolean f6730pv;

    /* JADX INFO: renamed from: qd */
    private int f6731qd;

    /* JADX INFO: renamed from: qh */
    private boolean f6732qh;
    private int qmx;

    /* JADX INFO: renamed from: qt */
    private float f6733qt;
    private boolean rbz;

    /* JADX INFO: renamed from: ri */
    private float f6734ri;
    private boolean rzk;
    private int saa;
    private boolean sez;

    /* JADX INFO: renamed from: sf */
    private double f6735sf;
    private String siy;
    private String skk;
    private String slm;
    private String smj;
    private int srn;

    /* JADX INFO: renamed from: su */
    private int f6736su;

    /* JADX INFO: renamed from: sz */
    private String f6737sz;

    /* JADX INFO: renamed from: ta */
    private boolean f6738ta;
    private String tan;
    private boolean tnn;
    private int tpb;

    /* JADX INFO: renamed from: tq */
    private long f6739tq = -1;

    /* JADX INFO: renamed from: tw */
    private JSONObject f6740tw;

    /* JADX INFO: renamed from: ud */
    private boolean f6741ud;

    /* JADX INFO: renamed from: uq */
    private String f6742uq;

    /* JADX INFO: renamed from: vr */
    private String f6743vr;

    /* JADX INFO: renamed from: vt */
    private int f6744vt;
    private boolean whw;
    private String wjv;

    /* JADX INFO: renamed from: xd */
    private String f6745xd;

    /* JADX INFO: renamed from: xe */
    private int f6746xe;

    /* JADX INFO: renamed from: xh */
    private String f6747xh;
    private float xha;
    private String xlq;

    /* JADX INFO: renamed from: xm */
    private boolean f6748xm;
    private int yjm;

    /* JADX INFO: renamed from: zb */
    private boolean f6749zb;

    /* JADX INFO: renamed from: zf */
    private double f6750zf;

    /* JADX INFO: renamed from: zk */
    private String f6751zk;

    /* JADX INFO: renamed from: zv */
    private int f6752zv;
    private boolean zxp;
    private int zyn;

    private void igq(String str) {
        this.skk = str;
    }

    /* JADX INFO: renamed from: ri */
    public static C2470di m8460ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C2470di c2470di = new C2470di();
        c2470di.m8528lr(jSONObject.optString("adType", "embeded"));
        c2470di.m8578vr(jSONObject.optString("clickArea", "creative"));
        c2470di.slm(jSONObject.optString("clickTigger", "click"));
        c2470di.m8511ik(jSONObject.optString("fontFamily", "PingFangSC"));
        c2470di.m8520ka(jSONObject.optString("textAlign", "left"));
        c2470di.m8497fi(jSONObject.optString("color", "#999999"));
        c2470di.m8485di(jSONObject.optString("bgColor", C11744X3.i.f26348T));
        c2470di.xha(jSONObject.optString("bgImgUrl", ""));
        c2470di.igq(jSONObject.optString("bgImgData", ""));
        c2470di.m8534mj(jSONObject.optString("borderColor", "#000000"));
        c2470di.jbs(jSONObject.optString("borderStyle", "solid"));
        c2470di.m8552qt(jSONObject.optString("heightMode", "auto"));
        c2470di.m8564sf(jSONObject.optString("widthMode", "fixed"));
        c2470di.m8478co(jSONObject.optString("interactText", ""));
        c2470di.m8513ik(jSONObject.optBoolean("isShowBgControl", false));
        c2470di.m8466aw(jSONObject.optString("interactBgColor", ""));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            c2470di.xha(jSONObjectOptJSONObject.optInt("translateY", 0));
            c2470di.m8533mj(jSONObjectOptJSONObject.optInt("translateX", 0));
            c2470di.m8517ka(jSONObjectOptJSONObject.optDouble("scaleX", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
            c2470di.m8494fi(jSONObjectOptJSONObject.optDouble("scaleY", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        }
        c2470di.bgr(jSONObject.optString("interactType", ""));
        c2470di.m8496fi(jSONObject.optInt("interactSlideDirection", -1));
        c2470di.m8474bu(jSONObject.optString("justifyHorizontal", "space-around"));
        c2470di.m8540nr(jSONObject.optString("justifyVertical", "flex-start"));
        c2470di.m8525lr(jSONObject.optDouble("timingStart"));
        c2470di.m8508ik(jSONObject.optDouble("timingEnd"));
        c2470di.m8518ka((float) jSONObject.optDouble("width", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        c2470di.m8509ik((float) jSONObject.optDouble("height", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        c2470di.m8555ri((float) jSONObject.optDouble("borderRadius", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        c2470di.m8526lr((float) jSONObject.optDouble("borderSize", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        c2470di.m8530lr(jSONObject.optBoolean("interactValidate", false));
        c2470di.jbs((float) jSONObject.optDouble("fontSize", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        c2470di.m8495fi((float) jSONObject.optDouble("paddingBottom", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        c2470di.m8483di((float) jSONObject.optDouble("paddingLeft", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        c2470di.xha((float) jSONObject.optDouble("paddingRight", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        c2470di.m8532mj((float) jSONObject.optDouble("paddingTop", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        c2470di.m8522ka(jSONObject.optBoolean("lineFeed", false));
        c2470di.jbs(jSONObject.optInt("lineCount", 0));
        c2470di.m8482di(jSONObject.optDouble("lineHeight", 1.2d));
        c2470di.bgr(jSONObject.optInt("letterSpacing", 0));
        c2470di.m8499fi(jSONObject.optBoolean("isDataFixed", false));
        c2470di.m8577vr(jSONObject.optInt("fontWeight"));
        c2470di.m8486di(jSONObject.optBoolean("lineLimit"));
        c2470di.slm(jSONObject.optInt(C11744X3.i.f26338L));
        c2470di.tan(jSONObject.optString("align"));
        c2470di.xha(jSONObject.optBoolean("useLeft"));
        c2470di.m8535mj(jSONObject.optBoolean("useRight"));
        c2470di.jbs(jSONObject.optBoolean("useTop"));
        c2470di.m8553qt(jSONObject.optBoolean("useBottom"));
        c2470di.m8464ac(jSONObject.optString("data"));
        c2470di.m8529lr(jSONObject.optJSONObject("i18n"));
        c2470di.m8477co(jSONObject.optInt("marginLeft"));
        c2470di.m8465aw(jSONObject.optInt("marginRight"));
        c2470di.m8551qt(jSONObject.optInt("marginTop"));
        c2470di.m8563sf(jSONObject.optInt("marginBottom"));
        c2470di.m8473bu(jSONObject.optInt("tagMaxCount"));
        c2470di.m8565sf(jSONObject.optBoolean("allowTextFlow"));
        c2470di.m8539nr(jSONObject.optInt("textFlowType"));
        c2470di.tan(jSONObject.optInt("textFlowDuration"));
        c2470di.m8463ac(jSONObject.optInt("left"));
        c2470di.ihz(jSONObject.optInt("right"));
        c2470di.m8574uq(jSONObject.optInt(ViewHierarchyConstants.DIMENSION_TOP_KEY));
        c2470di.wjv(jSONObject.optInt("bottom"));
        c2470di.ihz(jSONObject.optString("alignItems", "flex-start"));
        c2470di.m8575uq(jSONObject.optString("direction", ""));
        c2470di.m8560ri(jSONObject.optBoolean("loop", false));
        c2470di.m8470ay(jSONObject.optInt("zIndex"));
        c2470di.m8488dw(jSONObject.optInt("interactVisibleTime"));
        c2470di.m8502fr(jSONObject.optInt("interactHiddenTime"));
        c2470di.m8467aw(jSONObject.optBoolean("interactEnableMask"));
        c2470di.bgr(jSONObject.optBoolean("interactWontHide"));
        c2470di.m8558ri(jSONObject.optString("bgGradient"));
        c2470di.hcw(jSONObject.optInt("areaType"));
        c2470di.m8543oh(jSONObject.optInt("interactSlideThreshold", 0));
        c2470di.m8547pv(jSONObject.optInt("interactBottomDistance", C2490ka.m8810lr() ? 0 : 120));
        c2470di.m8541nr(jSONObject.optBoolean("openPlayableLandingPage", false));
        c2470di.m8512ik(jSONObject.optJSONObject("video"));
        c2470di.m8521ka(jSONObject.optJSONObject("image"));
        c2470di.m8582xd(jSONObject.optInt("borderShadowExtent"));
        c2470di.m8579vr(jSONObject.optBoolean("bgGauseBlur"));
        c2470di.dzy(jSONObject.optInt("bgGauseBlurRadius"));
        c2470di.slm(jSONObject.optBoolean("showTimeProgress", false));
        c2470di.m8475bu(jSONObject.optBoolean("showPlayButton", false));
        c2470di.m8554ri(jSONObject.optDouble("bgColorCg", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        c2470di.m8484di(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        c2470di.m8527lr(jSONObject.optInt("borderTopLeftRadius", 0));
        c2470di.m8556ri(jSONObject.optInt("borderTopRightRadius", 0));
        c2470di.m8519ka(jSONObject.optInt("borderBottomLeftRadius", 0));
        c2470di.m8510ik(jSONObject.optInt("borderBottomRightRadius", 0));
        c2470di.m8498fi(jSONObject.optJSONObject("interactI18n"));
        c2470di.m8471ay(jSONObject.optString("imageObjectFit"));
        c2470di.m8503fr(jSONObject.optString("interactTitle"));
        c2470di.ory(jSONObject.optInt("interactTextPositionTop"));
        c2470di.wjv(jSONObject.optString("imageLottieTosPath"));
        c2470di.m8479co(jSONObject.optBoolean("animationsLoop"));
        c2470di.m8567su(jSONObject.optInt("lottieAppNameMaxLength"));
        c2470di.m8588zf(jSONObject.optInt("lottieAdDescMaxLength"));
        c2470di.igq(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    C2477ri c2477ri = new C2477ri();
                    c2477ri.m8670ik(jSONObject2.optString("animationType"));
                    c2477ri.m8684ri(jSONObject2.optDouble("animationDuration"));
                    c2477ri.m8676lr(jSONObject2.optDouble("animationScaleX"));
                    c2477ri.m8668ik(jSONObject2.optDouble("animationScaleY"));
                    c2477ri.m8674ka(jSONObject2.optString("animationTimeFunction"));
                    c2477ri.m8672ka(jSONObject2.optDouble("animationDelay"));
                    c2477ri.m8661di(jSONObject2.optInt("animationIterationCount"));
                    c2477ri.m8666fi(jSONObject2.optString("animationDirection"));
                    c2477ri.m8664fi(jSONObject2.optDouble("animationInterval"));
                    c2477ri.m8685ri(jSONObject2.optInt("animationBorderWidth"));
                    c2477ri.m8686ri(jSONObject2.optLong("key"));
                    c2477ri.m8677lr(jSONObject2.optInt("animationEffectWidth"));
                    c2477ri.m8669ik(jSONObject2.optInt("animationSwing", 1));
                    c2477ri.m8673ka(jSONObject2.optInt("animationTranslateX"));
                    c2477ri.m8665fi(jSONObject2.optInt("animationTranslateY"));
                    c2477ri.m8678lr(jSONObject2.optString("animationRippleBackgroundColor"));
                    c2477ri.m8687ri(jSONObject2.optString("animationScaleDirection"));
                    c2477ri.xha(jSONObject2.optInt("animationFadeStart"));
                    c2477ri.m8680mj(jSONObject2.optInt("animationFadeEnd"));
                    c2477ri.m8662di(jSONObject2.optString("animationFillMode"));
                    c2477ri.jbs(jSONObject2.optInt("animationBounceHeight"));
                    if (c2470di.tan() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        c2477ri.m8672ka(c2477ri.bgr() + c2470di.tan());
                    }
                    arrayList.add(c2477ri);
                }
                c2470di.m8559ri(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                c2470di.m8568su(jSONObject.optString("triggerSlideDirection", "0"));
                c2470di.m8557ri(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return c2470di;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ri */
    private void m8461ri(C2470di c2470di, JSONObject jSONObject) {
        if (c2470di == null || jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.hashCode();
            byte b = -1;
            switch (next.hashCode()) {
                case -2067713583:
                    if (next.equals("isShowBgControl")) {
                        b = 0;
                    }
                    break;
                case -1965619659:
                    if (next.equals("clickArea")) {
                        b = 1;
                    }
                    break;
                case -1912831834:
                    if (next.equals("triggerSlideDirection")) {
                        b = 2;
                    }
                    break;
                case -1885934767:
                    if (next.equals("bgImgUrl")) {
                        b = 3;
                    }
                    break;
                case -1822062213:
                    if (next.equals("lineCount")) {
                        b = 4;
                    }
                    break;
                case -1821293778:
                    if (next.equals("openPlayableLandingPage")) {
                        b = 5;
                    }
                    break;
                case -1813937113:
                    if (next.equals("lineLimit")) {
                        b = 6;
                    }
                    break;
                case -1578250488:
                    if (next.equals("interactBgColor")) {
                        b = 7;
                    }
                    break;
                case -1501175880:
                    if (next.equals("paddingLeft")) {
                        b = 8;
                    }
                    break;
                case -1422965251:
                    if (next.equals("adType")) {
                        b = 9;
                    }
                    break;
                case -1383228885:
                    if (next.equals("bottom")) {
                        b = 10;
                    }
                    break;
                case -1224696685:
                    if (next.equals("fontFamily")) {
                        b = Ascii.f22503VT;
                    }
                    break;
                case -1221029593:
                    if (next.equals("height")) {
                        b = Ascii.f22492FF;
                    }
                    break;
                case -1065511464:
                    if (next.equals("textAlign")) {
                        b = Ascii.f22490CR;
                    }
                    break;
                case -1063257157:
                    if (next.equals("alignItems")) {
                        b = Ascii.f22500SO;
                    }
                    break;
                case -1046708884:
                    if (next.equals("interactValidate")) {
                        b = Ascii.f22499SI;
                    }
                    break;
                case -1044792121:
                    if (next.equals("marginTop")) {
                        b = Ascii.DLE;
                    }
                    break;
                case -1019884910:
                    if (next.equals("useBottom")) {
                        b = 17;
                    }
                    break;
                case -1005195314:
                    if (next.equals("triggerSlideMinDistance")) {
                        b = Ascii.DC2;
                    }
                    break;
                case -962590849:
                    if (next.equals("direction")) {
                        b = 19;
                    }
                    break;
                case -912366651:
                    if (next.equals("tagMaxCount")) {
                        b = Ascii.DC4;
                    }
                    break;
                case -848877971:
                    if (next.equals("interactHiddenTime")) {
                        b = Ascii.NAK;
                    }
                    break;
                case -836058546:
                    if (next.equals("useTop")) {
                        b = Ascii.SYN;
                    }
                    break;
                case -734428249:
                    if (next.equals("fontWeight")) {
                        b = Ascii.ETB;
                    }
                    break;
                case -731417480:
                    if (next.equals("zIndex")) {
                        b = Ascii.CAN;
                    }
                    break;
                case -709393864:
                    if (next.equals("timingStart")) {
                        b = Ascii.f22491EM;
                    }
                    break;
                case -515807685:
                    if (next.equals("lineHeight")) {
                        b = Ascii.SUB;
                    }
                    break;
                case -321658193:
                    if (next.equals("textFlowDuration")) {
                        b = Ascii.ESC;
                    }
                    break;
                case -295409451:
                    if (next.equals("useRight")) {
                        b = Ascii.f22493FS;
                    }
                    break;
                case -289173127:
                    if (next.equals("marginBottom")) {
                        b = Ascii.f22494GS;
                    }
                    break;
                case -204859874:
                    if (next.equals("bgColor")) {
                        b = Ascii.f22498RS;
                    }
                    break;
                case -148259282:
                    if (next.equals("useLeft")) {
                        b = Ascii.f22502US;
                    }
                    break;
                case -51738487:
                    if (next.equals("widthMode")) {
                        b = 32;
                    }
                    break;
                case 115029:
                    if (next.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                        b = 33;
                    }
                    break;
                case 3076010:
                    if (next.equals("data")) {
                        b = 34;
                    }
                    break;
                case 3317767:
                    if (next.equals("left")) {
                        b = 35;
                    }
                    break;
                case 3327652:
                    if (next.equals("loop")) {
                        b = 36;
                    }
                    break;
                case 90130308:
                    if (next.equals("paddingTop")) {
                        b = 37;
                    }
                    break;
                case 92903173:
                    if (next.equals("align")) {
                        b = 38;
                    }
                    break;
                case 94842723:
                    if (next.equals("color")) {
                        b = 39;
                    }
                    break;
                case 108511772:
                    if (next.equals("right")) {
                        b = 40;
                    }
                    break;
                case 113126854:
                    if (next.equals("width")) {
                        b = 41;
                    }
                    break;
                case 164611121:
                    if (next.equals("timingEnd")) {
                        b = 42;
                    }
                    break;
                case 202355100:
                    if (next.equals("paddingBottom")) {
                        b = 43;
                    }
                    break;
                case 247204452:
                    if (next.equals("allowTextFlow")) {
                        b = 44;
                    }
                    break;
                case 302841174:
                    if (next.equals("interactWontHide")) {
                        b = 45;
                    }
                    break;
                case 365601008:
                    if (next.equals("fontSize")) {
                        b = 46;
                    }
                    break;
                case 428975654:
                    if (next.equals("justifyVertical")) {
                        b = 47;
                    }
                    break;
                case 439444041:
                    if (next.equals("interactVisibleTime")) {
                        b = 48;
                    }
                    break;
                case 713848971:
                    if (next.equals("paddingRight")) {
                        b = 49;
                    }
                    break;
                case 722830999:
                    if (next.equals("borderColor")) {
                        b = 50;
                    }
                    break;
                case 737768677:
                    if (next.equals("borderStyle")) {
                        b = 51;
                    }
                    break;
                case 747804969:
                    if (next.equals(C11744X3.i.f26338L)) {
                        b = 52;
                    }
                    break;
                case 791643104:
                    if (next.equals("isDataFixed")) {
                        b = 53;
                    }
                    break;
                case 975087886:
                    if (next.equals("marginRight")) {
                        b = 54;
                    }
                    break;
                case 1110826708:
                    if (next.equals("justifyHorizontal")) {
                        b = 55;
                    }
                    break;
                case 1122368895:
                    if (next.equals("interactPosition")) {
                        b = 56;
                    }
                    break;
                case 1188229042:
                    if (next.equals("lineFeed")) {
                        b = 57;
                    }
                    break;
                case 1332036739:
                    if (next.equals("interactText")) {
                        b = 58;
                    }
                    break;
                case 1332055696:
                    if (next.equals("interactType")) {
                        b = 59;
                    }
                    break;
                case 1349188574:
                    if (next.equals("borderRadius")) {
                        b = 60;
                    }
                    break;
                case 1360828714:
                    if (next.equals("clickTigger")) {
                        b = Base64.padSymbol;
                    }
                    break;
                case 1490178922:
                    if (next.equals("heightMode")) {
                        b = 62;
                    }
                    break;
                case 1761274325:
                    if (next.equals("textFlowType")) {
                        b = 63;
                    }
                    break;
                case 1824903757:
                    if (next.equals("borderSize")) {
                        b = SignedBytes.MAX_POWER_OF_TWO;
                    }
                    break;
                case 1970934485:
                    if (next.equals("marginLeft")) {
                        b = 65;
                    }
                    break;
                case 2111078717:
                    if (next.equals("letterSpacing")) {
                        b = 66;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    c2470di.m8513ik(jSONObject.optBoolean(next, false));
                    break;
                case 1:
                    c2470di.m8578vr(jSONObject.optString(next));
                    break;
                case 2:
                    c2470di.m8568su(jSONObject.optString(next));
                    break;
                case 3:
                    c2470di.xha(jSONObject.optString(next));
                    break;
                case 4:
                    c2470di.jbs(jSONObject.optInt(next));
                    break;
                case 5:
                    c2470di.m8541nr(jSONObject.optBoolean(next));
                    break;
                case 6:
                    c2470di.m8486di(jSONObject.optBoolean(next));
                    break;
                case 7:
                    c2470di.m8466aw(jSONObject.optString(next));
                    break;
                case 8:
                    c2470di.m8483di((float) jSONObject.optDouble(next));
                    break;
                case 9:
                    c2470di.m8528lr(jSONObject.optString(next));
                    break;
                case 10:
                    c2470di.wjv(jSONObject.optInt(next));
                    break;
                case 11:
                    c2470di.m8511ik(jSONObject.optString(next));
                    break;
                case 12:
                    c2470di.m8509ik((float) jSONObject.optDouble(next));
                    break;
                case 13:
                    c2470di.m8520ka(jSONObject.optString(next));
                    break;
                case 14:
                    c2470di.ihz(jSONObject.optString(next));
                    break;
                case 15:
                    c2470di.m8530lr(jSONObject.optBoolean(next));
                    break;
                case 16:
                    c2470di.m8551qt(jSONObject.optInt(next));
                    break;
                case 17:
                    c2470di.m8553qt(jSONObject.optBoolean(next));
                    break;
                case 18:
                    c2470di.m8557ri(jSONObject.optLong(next));
                    break;
                case 19:
                    c2470di.m8575uq(jSONObject.optString(next));
                    break;
                case 20:
                    c2470di.m8473bu(jSONObject.optInt(next));
                    break;
                case 21:
                    c2470di.m8502fr(jSONObject.optInt(next));
                    break;
                case 22:
                    c2470di.jbs(jSONObject.optBoolean(next));
                    break;
                case 23:
                    c2470di.m8577vr(jSONObject.optInt(next));
                    break;
                case 24:
                    c2470di.m8470ay(jSONObject.optInt(next));
                    break;
                case 25:
                    c2470di.m8525lr(jSONObject.optDouble(next));
                    break;
                case 26:
                    c2470di.m8482di(jSONObject.optDouble(next));
                    break;
                case 27:
                    c2470di.tan(jSONObject.optInt(next));
                    break;
                case 28:
                    c2470di.m8535mj(jSONObject.optBoolean(next));
                    break;
                case 29:
                    c2470di.m8563sf(jSONObject.optInt(next));
                    break;
                case 30:
                    c2470di.m8485di(jSONObject.optString(next));
                    break;
                case 31:
                    c2470di.xha(jSONObject.optBoolean(next));
                    break;
                case 32:
                    c2470di.m8564sf(jSONObject.optString(next));
                    break;
                case 33:
                    c2470di.m8574uq(jSONObject.optInt(next));
                    break;
                case 34:
                    c2470di.m8464ac(jSONObject.optString(next));
                    break;
                case 35:
                    c2470di.m8463ac(jSONObject.optInt(next));
                    break;
                case 36:
                    c2470di.m8560ri(jSONObject.optBoolean(next));
                    break;
                case 37:
                    c2470di.m8532mj((float) jSONObject.optDouble(next));
                    break;
                case 38:
                    c2470di.tan(jSONObject.optString(next));
                    break;
                case 39:
                    c2470di.m8497fi(jSONObject.optString(next));
                    break;
                case 40:
                    c2470di.ihz(jSONObject.optInt(next));
                    break;
                case 41:
                    c2470di.m8518ka((float) jSONObject.optDouble(next));
                    break;
                case 42:
                    c2470di.m8508ik(jSONObject.optDouble(next));
                    break;
                case 43:
                    c2470di.m8495fi((float) jSONObject.optDouble(next));
                    break;
                case 44:
                    c2470di.m8565sf(jSONObject.optBoolean(next));
                    break;
                case 45:
                    c2470di.bgr(jSONObject.optBoolean(next));
                    break;
                case 46:
                    c2470di.jbs((float) jSONObject.optDouble(next));
                    break;
                case 47:
                    c2470di.m8540nr(jSONObject.optString(next));
                    break;
                case 48:
                    c2470di.m8488dw(jSONObject.optInt(next));
                    break;
                case 49:
                    c2470di.xha((float) jSONObject.optDouble(next));
                    break;
                case 50:
                    c2470di.m8534mj(jSONObject.optString(next));
                    break;
                case 51:
                    c2470di.jbs(jSONObject.optString(next));
                    break;
                case 52:
                    c2470di.slm(jSONObject.optInt(next));
                    break;
                case 53:
                    c2470di.m8499fi(jSONObject.optBoolean(next));
                    break;
                case 54:
                    c2470di.m8465aw(jSONObject.optInt(next));
                    break;
                case 55:
                    c2470di.m8474bu(jSONObject.optString(next));
                    break;
                case 56:
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject != null) {
                        c2470di.xha(jSONObjectOptJSONObject.optInt("translateY", 0));
                        c2470di.m8533mj(jSONObjectOptJSONObject.optInt("translateX", 0));
                        c2470di.m8517ka(jSONObjectOptJSONObject.optDouble("scaleX", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
                        c2470di.m8494fi(jSONObjectOptJSONObject.optDouble("scaleY", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
                    }
                    break;
                case 57:
                    c2470di.m8522ka(jSONObject.optBoolean(next));
                    break;
                case 58:
                    c2470di.m8478co(jSONObject.optString(next));
                    break;
                case 59:
                    c2470di.bgr(jSONObject.optString(next));
                    break;
                case 60:
                    c2470di.m8555ri((float) jSONObject.optDouble(next));
                    break;
                case 61:
                    c2470di.slm(jSONObject.optString(next));
                    break;
                case 62:
                    c2470di.m8552qt(jSONObject.optString(next));
                    break;
                case 63:
                    c2470di.m8539nr(jSONObject.optInt(next));
                    break;
                case 64:
                    c2470di.m8526lr((float) jSONObject.optDouble(next));
                    break;
                case 65:
                    c2470di.m8477co(jSONObject.optInt(next));
                    break;
                case 66:
                    c2470di.bgr(jSONObject.optInt(next));
                    break;
            }
        }
    }

    public boolean aac() {
        return this.rzk;
    }

    /* JADX INFO: renamed from: ac */
    public double m8462ac() {
        return this.f6702co;
    }

    /* JADX INFO: renamed from: ac */
    public void m8463ac(int i) {
        this.yjm = i;
    }

    /* JADX INFO: renamed from: ac */
    public void m8464ac(String str) {
        this.gcp = str;
    }

    public boolean adz() {
        return this.iph;
    }

    public boolean ajz() {
        return this.f6749zb;
    }

    public boolean akr() {
        return this.zxp;
    }

    public void amj() {
        m8461ri(this, this.akr);
    }

    /* JADX INFO: renamed from: aw */
    public void m8465aw(int i) {
        this.f6721kt = i;
    }

    /* JADX INFO: renamed from: aw */
    public void m8466aw(String str) {
        this.f6700ay = str;
    }

    /* JADX INFO: renamed from: aw */
    public void m8467aw(boolean z) {
        this.bzf = z;
    }

    /* JADX INFO: renamed from: aw */
    public boolean m8468aw() {
        return this.f6710fi;
    }

    /* JADX INFO: renamed from: ay */
    public String m8469ay() {
        return this.f6726nr;
    }

    /* JADX INFO: renamed from: ay */
    public void m8470ay(int i) {
        this.hpn = i;
    }

    /* JADX INFO: renamed from: ay */
    public void m8471ay(String str) {
        this.f6737sz = str;
    }

    public void bfa() {
        m8461ri(this, this.f6703de);
    }

    public float bgr() {
        return this.f6704di;
    }

    public void bgr(int i) {
        this.zyn = i;
    }

    public void bgr(String str) {
        this.ory = str;
    }

    public void bgr(boolean z) {
        this.zxp = z;
    }

    public int bnj() {
        return this.f6721kt;
    }

    /* JADX INFO: renamed from: bu */
    public float m8472bu() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: bu */
    public void m8473bu(int i) {
        this.f6724nd = i;
    }

    /* JADX INFO: renamed from: bu */
    public void m8474bu(String str) {
        this.f6745xd = str;
    }

    /* JADX INFO: renamed from: bu */
    public void m8475bu(boolean z) {
        this.che = z;
    }

    public String bzf() {
        return this.xlq;
    }

    public int che() {
        return this.amj;
    }

    /* JADX INFO: renamed from: co */
    public float m8476co() {
        return this.f6722lr;
    }

    /* JADX INFO: renamed from: co */
    public void m8477co(int i) {
        this.f6717jc = i;
    }

    /* JADX INFO: renamed from: co */
    public void m8478co(String str) {
        this.wjv = str;
    }

    /* JADX INFO: renamed from: co */
    public void m8479co(boolean z) {
        this.rbz = z;
    }

    /* JADX INFO: renamed from: de */
    public String m8480de() {
        return this.f6737sz;
    }

    /* JADX INFO: renamed from: di */
    public JSONObject m8481di() {
        return this.f6707eu;
    }

    /* JADX INFO: renamed from: di */
    public void m8482di(double d) {
        this.feb = d;
    }

    /* JADX INFO: renamed from: di */
    public void m8483di(float f) {
        this.xha = f;
    }

    /* JADX INFO: renamed from: di */
    public void m8484di(int i) {
        this.tpb = i;
    }

    /* JADX INFO: renamed from: di */
    public void m8485di(String str) {
        this.f6701bu = str;
    }

    /* JADX INFO: renamed from: di */
    public void m8486di(boolean z) {
        this.f6738ta = z;
    }

    /* JADX INFO: renamed from: dw */
    public String m8487dw() {
        return this.wjv;
    }

    /* JADX INFO: renamed from: dw */
    public void m8488dw(int i) {
        this.f6714id = i;
    }

    public double dzy() {
        return this.f6750zf;
    }

    public void dzy(int i) {
        this.f6744vt = i;
    }

    /* JADX INFO: renamed from: eb */
    public int m8489eb() {
        return this.qmx;
    }

    public String eqw() {
        return this.f6711fn;
    }

    /* JADX INFO: renamed from: eu */
    public int m8490eu() {
        return this.jxw;
    }

    public boolean evm() {
        return this.f6729pu;
    }

    public int ezp() {
        return this.f6744vt;
    }

    /* JADX INFO: renamed from: fb */
    public int m8491fb() {
        return this.f6713hd;
    }

    /* JADX INFO: renamed from: fe */
    public int m8492fe() {
        return this.srn;
    }

    public boolean feb() {
        return this.f6730pv;
    }

    /* JADX INFO: renamed from: fi */
    public int m8493fi() {
        return this.evm;
    }

    /* JADX INFO: renamed from: fi */
    public void m8494fi(double d) {
        this.f6705dw = d;
    }

    /* JADX INFO: renamed from: fi */
    public void m8495fi(float f) {
        this.f6704di = f;
    }

    /* JADX INFO: renamed from: fi */
    public void m8496fi(int i) {
        this.f6752zv = i;
    }

    /* JADX INFO: renamed from: fi */
    public void m8497fi(String str) {
        this.slm = str;
    }

    /* JADX INFO: renamed from: fi */
    public void m8498fi(JSONObject jSONObject) {
        this.f6707eu = jSONObject;
    }

    /* JADX INFO: renamed from: fi */
    public void m8499fi(boolean z) {
        this.tnn = z;
    }

    /* JADX INFO: renamed from: fn */
    public String m8500fn() {
        return this.f6747xh;
    }

    /* JADX INFO: renamed from: fr */
    public String m8501fr() {
        return this.skk;
    }

    /* JADX INFO: renamed from: fr */
    public void m8502fr(int i) {
        this.qmx = i;
    }

    /* JADX INFO: renamed from: fr */
    public void m8503fr(String str) {
        this.f6711fn = str;
    }

    public int gcp() {
        return this.bnj;
    }

    public void hcw(int i) {
        this.jxw = i;
    }

    public boolean hcw() {
        return this.f6712fr;
    }

    /* JADX INFO: renamed from: hd */
    public int m8504hd() {
        return this.bfa;
    }

    public int hpn() {
        return this.saa;
    }

    public String hws() {
        return this.f6751zk;
    }

    /* JADX INFO: renamed from: id */
    public int m8505id() {
        return this.ajz;
    }

    /* JADX INFO: renamed from: ig */
    public String m8506ig() {
        return this.ory;
    }

    public String igq() {
        return this.ihz;
    }

    public void igq(int i) {
        this.amj = i;
    }

    public String ihz() {
        return this.f6743vr;
    }

    public void ihz(int i) {
        this.saa = i;
    }

    public void ihz(String str) {
        this.f6751zk = str;
    }

    /* JADX INFO: renamed from: ik */
    public int m8507ik() {
        return this.adz;
    }

    /* JADX INFO: renamed from: ik */
    public void m8508ik(double d) {
        this.f6702co = d;
    }

    /* JADX INFO: renamed from: ik */
    public void m8509ik(float f) {
        this.f6716ik = f;
    }

    /* JADX INFO: renamed from: ik */
    public void m8510ik(int i) {
        this.ezp = i;
    }

    /* JADX INFO: renamed from: ik */
    public void m8511ik(String str) {
        this.bgr = str;
    }

    /* JADX INFO: renamed from: ik */
    public void m8512ik(JSONObject jSONObject) {
        this.akr = jSONObject;
    }

    /* JADX INFO: renamed from: ik */
    public void m8513ik(boolean z) {
        this.f6712fr = z;
    }

    public boolean iph() {
        return this.rbz;
    }

    public int jbs() {
        return this.tpb;
    }

    public void jbs(float f) {
        this.f6733qt = f;
    }

    public void jbs(int i) {
        this.f6715ig = i;
    }

    public void jbs(String str) {
        this.f6698ac = str;
    }

    public void jbs(boolean z) {
        this.rzk = z;
    }

    /* JADX INFO: renamed from: jc */
    public String m8514jc() {
        return this.f6745xd;
    }

    /* JADX INFO: renamed from: jm */
    public int m8515jm() {
        return this.f6706eb;
    }

    public String jxw() {
        return this.luy;
    }

    /* JADX INFO: renamed from: ka */
    public int m8516ka() {
        return this.ezp;
    }

    /* JADX INFO: renamed from: ka */
    public void m8517ka(double d) {
        this.f6750zf = d;
    }

    /* JADX INFO: renamed from: ka */
    public void m8518ka(float f) {
        this.f6720ka = f;
    }

    /* JADX INFO: renamed from: ka */
    public void m8519ka(int i) {
        this.evm = i;
    }

    /* JADX INFO: renamed from: ka */
    public void m8520ka(String str) {
        this.f6743vr = str;
    }

    /* JADX INFO: renamed from: ka */
    public void m8521ka(JSONObject jSONObject) {
        this.f6703de = jSONObject;
    }

    /* JADX INFO: renamed from: ka */
    public void m8522ka(boolean z) {
        this.f6730pv = z;
    }

    /* JADX INFO: renamed from: kt */
    public String m8523kt() {
        return this.dzy;
    }

    /* JADX INFO: renamed from: lr */
    public int m8524lr() {
        return this.f6719jm;
    }

    /* JADX INFO: renamed from: lr */
    public void m8525lr(double d) {
        this.f6735sf = d;
    }

    /* JADX INFO: renamed from: lr */
    public void m8526lr(float f) {
        this.f6722lr = f;
    }

    /* JADX INFO: renamed from: lr */
    public void m8527lr(int i) {
        this.adz = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m8528lr(String str) {
        this.f6699aw = str;
    }

    /* JADX INFO: renamed from: lr */
    public void m8529lr(JSONObject jSONObject) {
        this.f6740tw = jSONObject;
    }

    /* JADX INFO: renamed from: lr */
    public void m8530lr(boolean z) {
        this.f6710fi = z;
    }

    public int luy() {
        return this.f6746xe;
    }

    /* JADX INFO: renamed from: mj */
    public double m8531mj() {
        return this.nbc;
    }

    /* JADX INFO: renamed from: mj */
    public void m8532mj(float f) {
        this.jbs = f;
    }

    /* JADX INFO: renamed from: mj */
    public void m8533mj(int i) {
        this.igq = i;
    }

    /* JADX INFO: renamed from: mj */
    public void m8534mj(String str) {
        this.tan = str;
    }

    /* JADX INFO: renamed from: mj */
    public void m8535mj(boolean z) {
        this.f6748xm = z;
    }

    public int nbc() {
        return this.f6714id;
    }

    /* JADX INFO: renamed from: nd */
    public boolean m8536nd() {
        return this.whw;
    }

    /* JADX INFO: renamed from: nh */
    public int m8537nh() {
        return this.hpn;
    }

    /* JADX INFO: renamed from: nr */
    public float m8538nr() {
        return this.f6733qt;
    }

    /* JADX INFO: renamed from: nr */
    public void m8539nr(int i) {
        this.aac = i;
    }

    /* JADX INFO: renamed from: nr */
    public void m8540nr(String str) {
        this.dzy = str;
    }

    /* JADX INFO: renamed from: nr */
    public void m8541nr(boolean z) {
        this.sez = z;
    }

    /* JADX INFO: renamed from: oh */
    public int m8542oh() {
        return this.f6736su;
    }

    /* JADX INFO: renamed from: oh */
    public void m8543oh(int i) {
        this.f6725nh = i;
    }

    public String ory() {
        return this.f6700ay;
    }

    public void ory(int i) {
        this.f6708fb = i;
    }

    /* JADX INFO: renamed from: pc */
    public int m8544pc() {
        return this.f6724nd;
    }

    /* JADX INFO: renamed from: pu */
    public int m8545pu() {
        return this.eqw;
    }

    /* JADX INFO: renamed from: pv */
    public double m8546pv() {
        return this.f6705dw;
    }

    /* JADX INFO: renamed from: pv */
    public void m8547pv(int i) {
        this.f6713hd = i;
    }

    /* JADX INFO: renamed from: qd */
    public String m8548qd() {
        return this.hcw;
    }

    /* JADX INFO: renamed from: qh */
    public boolean m8549qh() {
        return this.f6738ta;
    }

    public int qmx() {
        return this.f6728pc;
    }

    /* JADX INFO: renamed from: qt */
    public String m8550qt() {
        return this.f6718jg;
    }

    /* JADX INFO: renamed from: qt */
    public void m8551qt(int i) {
        this.f6731qd = i;
    }

    /* JADX INFO: renamed from: qt */
    public void m8552qt(String str) {
        this.ihz = str;
    }

    /* JADX INFO: renamed from: qt */
    public void m8553qt(boolean z) {
        this.f6732qh = z;
    }

    public JSONObject rbz() {
        return this.f6703de;
    }

    /* JADX INFO: renamed from: ri */
    public void m8554ri(double d) {
        this.nbc = d;
    }

    /* JADX INFO: renamed from: ri */
    public void m8555ri(float f) {
        this.f6734ri = f;
    }

    /* JADX INFO: renamed from: ri */
    public void m8556ri(int i) {
        this.f6719jm = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m8557ri(long j) {
        this.f6739tq = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m8558ri(String str) {
        this.f6718jg = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m8559ri(List<C2477ri> list) {
        this.hws = list;
    }

    /* JADX INFO: renamed from: ri */
    public void m8560ri(boolean z) {
        this.f6741ud = z;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m8561ri() {
        return this.f6741ud;
    }

    public int rzk() {
        return this.f6709fe;
    }

    public JSONObject saa() {
        return this.f6740tw;
    }

    public boolean sez() {
        return this.bzf;
    }

    /* JADX INFO: renamed from: sf */
    public float m8562sf() {
        return this.f6734ri;
    }

    /* JADX INFO: renamed from: sf */
    public void m8563sf(int i) {
        this.srn = i;
    }

    /* JADX INFO: renamed from: sf */
    public void m8564sf(String str) {
        this.f6742uq = str;
    }

    /* JADX INFO: renamed from: sf */
    public void m8565sf(boolean z) {
        this.f6749zb = z;
    }

    public double siy() {
        return this.feb;
    }

    public float slm() {
        return this.f6723mj;
    }

    public void slm(int i) {
        this.bnj = i;
    }

    public void slm(String str) {
        this.f6727oh = str;
    }

    public void slm(boolean z) {
        this.f6729pu = z;
    }

    public boolean smj() {
        return this.sez;
    }

    public String srn() {
        return this.f6727oh;
    }

    /* JADX INFO: renamed from: su */
    public String m8566su() {
        return this.tan;
    }

    /* JADX INFO: renamed from: su */
    public void m8567su(int i) {
        this.eqw = i;
    }

    /* JADX INFO: renamed from: su */
    public void m8568su(String str) {
        this.f6747xh = str;
    }

    /* JADX INFO: renamed from: sz */
    public boolean m8569sz() {
        return this.che;
    }

    /* JADX INFO: renamed from: ta */
    public int m8570ta() {
        return this.f6717jc;
    }

    public double tan() {
        return this.f6735sf;
    }

    public void tan(int i) {
        this.f6746xe = i;
    }

    public void tan(String str) {
        this.siy = str;
    }

    public int tnn() {
        return this.f6731qd;
    }

    public int tpb() {
        return this.f6725nh;
    }

    /* JADX INFO: renamed from: tw */
    public String m8571tw() {
        return this.siy;
    }

    /* JADX INFO: renamed from: ud */
    public int m8572ud() {
        return this.yjm;
    }

    /* JADX INFO: renamed from: uq */
    public String m8573uq() {
        return this.slm;
    }

    /* JADX INFO: renamed from: uq */
    public void m8574uq(int i) {
        this.f6728pc = i;
    }

    /* JADX INFO: renamed from: uq */
    public void m8575uq(String str) {
        this.luy = str;
    }

    /* JADX INFO: renamed from: vr */
    public float m8576vr() {
        return this.xha;
    }

    /* JADX INFO: renamed from: vr */
    public void m8577vr(int i) {
        this.f6709fe = i;
    }

    /* JADX INFO: renamed from: vr */
    public void m8578vr(String str) {
        this.hcw = str;
    }

    /* JADX INFO: renamed from: vr */
    public void m8579vr(boolean z) {
        this.iph = z;
    }

    /* JADX INFO: renamed from: vt */
    public String m8580vt() {
        return this.smj;
    }

    public int whw() {
        return this.zyn;
    }

    public String wjv() {
        return this.f6701bu;
    }

    public void wjv(int i) {
        this.ajz = i;
    }

    public void wjv(String str) {
        this.smj = str;
    }

    /* JADX INFO: renamed from: xd */
    public int m8581xd() {
        return this.igq;
    }

    /* JADX INFO: renamed from: xd */
    public void m8582xd(int i) {
        this.f6706eb = i;
    }

    /* JADX INFO: renamed from: xe */
    public boolean m8583xe() {
        return this.f6732qh;
    }

    /* JADX INFO: renamed from: xh */
    public long m8584xh() {
        return this.f6739tq;
    }

    public int xha() {
        return this.f6752zv;
    }

    public void xha(float f) {
        this.f6723mj = f;
    }

    public void xha(int i) {
        this.f6736su = i;
    }

    public void xha(String str) {
        this.f6726nr = str;
    }

    public void xha(boolean z) {
        this.whw = z;
    }

    public List<C2477ri> xlq() {
        return this.hws;
    }

    /* JADX INFO: renamed from: xm */
    public boolean m8585xm() {
        return this.tnn;
    }

    public String yjm() {
        return this.gcp;
    }

    /* JADX INFO: renamed from: zb */
    public boolean m8586zb() {
        return this.f6748xm;
    }

    /* JADX INFO: renamed from: zf */
    public String m8587zf() {
        return this.f6742uq;
    }

    /* JADX INFO: renamed from: zf */
    public void m8588zf(int i) {
        this.bfa = i;
    }

    /* JADX INFO: renamed from: zk */
    public int m8589zk() {
        return this.aac;
    }

    /* JADX INFO: renamed from: zv */
    public int m8590zv() {
        return this.f6708fb;
    }

    public int zxp() {
        List<C2477ri> list = this.hws;
        if (list == null) {
            return 0;
        }
        for (C2477ri c2477ri : list) {
            if ("translate".equals(c2477ri.jbs()) && c2477ri.xha() < 0) {
                return -c2477ri.xha();
            }
        }
        return 0;
    }

    public int zyn() {
        return this.f6715ig;
    }
}
