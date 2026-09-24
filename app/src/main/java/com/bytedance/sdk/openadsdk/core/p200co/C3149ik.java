package com.bytedance.sdk.openadsdk.core.p200co;

import android.content.Context;
import com.bytedance.adsdk.p077ri.C2172ik;
import com.bytedance.adsdk.ugeno.C2260fi;
import com.bytedance.adsdk.ugeno.C2267ik;
import com.bytedance.adsdk.ugeno.C2317lr;
import com.bytedance.adsdk.ugeno.core.C2233lr;
import com.bytedance.adsdk.ugeno.core.InterfaceC2231ik;
import com.bytedance.adsdk.ugeno.jbs.p095di.C2270lr;
import com.bytedance.adsdk.ugeno.jbs.p096fi.C2272lr;
import com.bytedance.adsdk.ugeno.jbs.p098ka.C2275ik;
import com.bytedance.adsdk.ugeno.jbs.p099lr.C2278lr;
import com.bytedance.adsdk.ugeno.jbs.p100ri.C2280ri;
import com.bytedance.adsdk.ugeno.p093fi.C2261di;
import com.bytedance.adsdk.ugeno.p101ka.C2285di;
import com.bytedance.adsdk.ugeno.p101ka.C2303lr;
import com.bytedance.adsdk.ugeno.p101ka.InterfaceC2287ik;
import com.bytedance.adsdk.ugeno.p101ka.InterfaceC2309mj;
import com.bytedance.adsdk.ugeno.p101ka.p102ik.C2288ik;
import com.bytedance.adsdk.ugeno.p101ka.p102ik.C2289lr;
import com.bytedance.adsdk.ugeno.p101ka.p102ik.C2290ri;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.C2294di;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.C2299mj;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.C2301ri;
import com.bytedance.adsdk.ugeno.p101ka.p104lr.AbstractC2308ri;
import com.bytedance.adsdk.ugeno.p101ka.p104lr.C2305ik;
import com.bytedance.adsdk.ugeno.p101ka.xha;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.yoga.p111lr.C2358ri;
import com.bytedance.sdk.openadsdk.core.p200co.p203fi.p204lr.C3144ik;
import com.bytedance.sdk.openadsdk.core.p200co.p203fi.p204lr.C3145ka;
import com.bytedance.sdk.openadsdk.core.p200co.p203fi.p204lr.C3146lr;
import com.bytedance.sdk.openadsdk.core.p200co.p203fi.p204lr.C3147ri;
import com.bytedance.sdk.openadsdk.core.p200co.p203fi.p205ri.C3148ri;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.C3159di;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.C3162fi;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.C3165ik;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.C3168ka;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.C3172lr;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.C3175ri;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.p209di.C3160lr;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.p210fi.C3163lr;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.p211ik.C3166lr;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.p212ka.C3169ik;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.p212ka.C3170lr;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.p213lr.C3174ri;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.p214ri.C3176lr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3149ik {
    /* JADX INFO: renamed from: ri */
    public static void m13142ri() {
        try {
            System.loadLibrary("tt_ugen_layout");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m13143ri(Context context) {
        C2260fi.m7537ri().m7542ri(context, new InterfaceC2231ik() { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1
            @Override // com.bytedance.adsdk.ugeno.core.InterfaceC2231ik
            /* JADX INFO: renamed from: ri */
            public List<C2233lr> mo7358ri() {
                ArrayList arrayList = new ArrayList();
                String str = "Lottie";
                arrayList.add(new C2233lr(str) { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.1
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3174ri(context2);
                    }
                });
                arrayList.add(new C2233lr("Logo") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.12
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3162fi(context2);
                    }
                });
                arrayList.add(new C2233lr("CommentNum") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.23
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3175ri(context2);
                    }
                });
                arrayList.add(new C2233lr("View") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.24
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C2358ri(context2);
                    }
                });
                arrayList.add(new C2233lr("CustomComponent") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.25
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C2358ri(context2);
                    }
                });
                arrayList.add(new C2233lr("Text") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.26
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C2270lr(context2);
                    }
                });
                arrayList.add(new C2233lr("Image") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.27
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C2275ik(context2);
                    }
                });
                arrayList.add(new C2233lr("FlexLayout") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.28
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C2261di(context2);
                    }
                });
                arrayList.add(new C2233lr("FrameLayout") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.29
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C2278lr(context2);
                    }
                });
                arrayList.add(new C2233lr("RatingBar") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.2
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C2272lr(context2);
                    }
                });
                arrayList.add(new C2233lr("RatingStar") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.3
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C2272lr(context2);
                    }
                });
                arrayList.add(new C2233lr("Button") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.4
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C2280ri(context2);
                    }
                });
                arrayList.add(new C2233lr("Video") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.5
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3160lr(context2);
                    }
                });
                arrayList.add(new C2233lr("VideoV3") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.6
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3160lr(context2);
                    }
                });
                arrayList.add(new C2233lr(str) { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.7
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3174ri(context2);
                    }
                });
                arrayList.add(new C2233lr("Swiper") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.8
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C2267ik(context2);
                    }
                });
                arrayList.add(new C2233lr("Icon") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.9
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3168ka(context2);
                    }
                });
                arrayList.add(new C2233lr("FVCountdown") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.10
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3172lr(context2);
                    }
                });
                arrayList.add(new C2233lr("RVCountdown") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.11
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3172lr(context2);
                    }
                });
                arrayList.add(new C2233lr("FVSkipView") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.13
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3159di(context2);
                    }
                });
                arrayList.add(new C2233lr("RVSkipView") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.14
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3159di(context2);
                    }
                });
                arrayList.add(new C2233lr("AOSkipView") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.15
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3159di(context2);
                    }
                });
                arrayList.add(new C2233lr("AOCountdown") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.16
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3172lr(context2);
                    }
                });
                arrayList.add(new C2233lr("PlayableComponent") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.17
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3165ik(context2);
                    }
                });
                arrayList.add(new C2233lr("SwiperView") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.18
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C2317lr(context2);
                    }
                });
                arrayList.add(new C2233lr("SlideView") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.19
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3163lr(context2);
                    }
                });
                arrayList.add(new C2233lr("Playable") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.20
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3166lr(context2);
                    }
                });
                arrayList.add(new C2233lr("ProgressBar") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.21
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3169ik(context2);
                    }
                });
                arrayList.add(new C2233lr("FlipDown") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.1.22
                    @Override // com.bytedance.adsdk.ugeno.core.C2233lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractViewOnTouchListenerC2318ik mo7361ri(Context context2) {
                        return new C3176lr(context2);
                    }
                });
                return arrayList;
            }
        }, new C3181ri());
        C2260fi.m7537ri().m7545ri(new InterfaceC2309mj() { // from class: com.bytedance.sdk.openadsdk.core.co.ik.2
            @Override // com.bytedance.adsdk.ugeno.p101ka.InterfaceC2309mj
            /* JADX INFO: renamed from: ri */
            public List<xha> mo7803ri() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new xha("SwiperView://slide") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.2.1
                    @Override // com.bytedance.adsdk.ugeno.p101ka.xha
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2296ik mo7806ri(Context context2) {
                        return new C2299mj(context2);
                    }
                });
                arrayList.add(new xha("SwiperView://finish") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.2.3
                    @Override // com.bytedance.adsdk.ugeno.p101ka.xha
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2296ik mo7806ri(Context context2) {
                        return new C2294di(context2);
                    }
                });
                arrayList.add(new xha("SwiperView://reloop") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.2.4
                    @Override // com.bytedance.adsdk.ugeno.p101ka.xha
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2296ik mo7806ri(Context context2) {
                        return new com.bytedance.adsdk.ugeno.p101ka.p103ka.xha(context2);
                    }
                });
                arrayList.add(new xha("renderDidFinish") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.2.5
                    @Override // com.bytedance.adsdk.ugeno.p101ka.xha
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2296ik mo7806ri(Context context2) {
                        return new C2301ri(context2);
                    }
                });
                arrayList.add(new xha("Lottie://state") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.2.6
                    @Override // com.bytedance.adsdk.ugeno.p101ka.xha
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2296ik mo7806ri(Context context2) {
                        return new C3146lr(context2);
                    }
                });
                arrayList.add(new xha("videoProgress") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.2.7
                    @Override // com.bytedance.adsdk.ugeno.p101ka.xha
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2296ik mo7806ri(Context context2) {
                        return new C3145ka(context2);
                    }
                });
                arrayList.add(new xha("videoFail") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.2.8
                    @Override // com.bytedance.adsdk.ugeno.p101ka.xha
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2296ik mo7806ri(Context context2) {
                        return new C3144ik(context2);
                    }
                });
                arrayList.add(new xha("show") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.2.9
                    @Override // com.bytedance.adsdk.ugeno.p101ka.xha
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2296ik mo7806ri(Context context2) {
                        return new C2301ri(context2);
                    }
                });
                arrayList.add(new xha("ProgressBar://progress") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.2.10
                    @Override // com.bytedance.adsdk.ugeno.p101ka.xha
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2296ik mo7806ri(Context context2) {
                        return new C3170lr(context2);
                    }
                });
                arrayList.add(new xha("countdown") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.2.2
                    @Override // com.bytedance.adsdk.ugeno.p101ka.xha
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2296ik mo7806ri(Context context2) {
                        return new C3147ri(context2);
                    }
                });
                return arrayList;
            }
        });
        C2260fi.m7537ri().m7544ri(new InterfaceC2287ik() { // from class: com.bytedance.sdk.openadsdk.core.co.ik.3
            @Override // com.bytedance.adsdk.ugeno.p101ka.InterfaceC2287ik
            /* JADX INFO: renamed from: ri */
            public List<C2303lr> mo7757ri() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C2303lr("swiperNext") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.3.1
                    @Override // com.bytedance.adsdk.ugeno.p101ka.C2303lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2308ri mo7758ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
                        return new C2290ri(abstractViewOnTouchListenerC2318ik, str, riVar);
                    }
                });
                arrayList.add(new C2303lr("swiperPrevious") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.3.2
                    @Override // com.bytedance.adsdk.ugeno.p101ka.C2303lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2308ri mo7758ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
                        return new C2288ik(abstractViewOnTouchListenerC2318ik, str, riVar);
                    }
                });
                arrayList.add(new C2303lr("swiperPosition") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.3.3
                    @Override // com.bytedance.adsdk.ugeno.p101ka.C2303lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2308ri mo7758ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
                        return new C2289lr(abstractViewOnTouchListenerC2318ik, str, riVar);
                    }
                });
                arrayList.add(new C2303lr("speedVideoOrTimer") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.3.4
                    @Override // com.bytedance.adsdk.ugeno.p101ka.C2303lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2308ri mo7758ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
                        return new C2305ik(abstractViewOnTouchListenerC2318ik, str, riVar);
                    }
                });
                arrayList.add(new C2303lr("openLinks") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.3.5
                    @Override // com.bytedance.adsdk.ugeno.p101ka.C2303lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2308ri mo7758ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
                        return new C2305ik(abstractViewOnTouchListenerC2318ik, str, riVar);
                    }
                });
                arrayList.add(new C2303lr("sendLogExtra") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.3.6
                    @Override // com.bytedance.adsdk.ugeno.p101ka.C2303lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2308ri mo7758ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
                        return new C2305ik(abstractViewOnTouchListenerC2318ik, str, riVar);
                    }
                });
                arrayList.add(new C2303lr("sendAdExtra") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.3.7
                    @Override // com.bytedance.adsdk.ugeno.p101ka.C2303lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2308ri mo7758ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
                        return new C2305ik(abstractViewOnTouchListenerC2318ik, str, riVar);
                    }
                });
                arrayList.add(new C2303lr("Lottie://start") { // from class: com.bytedance.sdk.openadsdk.core.co.ik.3.8
                    @Override // com.bytedance.adsdk.ugeno.p101ka.C2303lr
                    /* JADX INFO: renamed from: ri */
                    public AbstractC2308ri mo7758ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
                        return new C3148ri(abstractViewOnTouchListenerC2318ik, str, riVar);
                    }
                });
                return arrayList;
            }
        });
        C2260fi.m7537ri().m7543ri(new C2172ik());
    }
}
