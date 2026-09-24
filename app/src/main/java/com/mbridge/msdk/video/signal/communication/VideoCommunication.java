package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;

/* JADX INFO: loaded from: classes7.dex */
public class VideoCommunication extends BaseVideoCommunication {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f40623j = 0;

    /* JADX INFO: renamed from: i */
    private Handler f40624i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$a */
    class RunnableC14089a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40625a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40626b;

        RunnableC14089a(Object obj, String str) {
            this.f40625a = obj;
            this.f40626b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.progressBarOperate(this.f40625a, this.f40626b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$a0 */
    class RunnableC14090a0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40628a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40629b;

        RunnableC14090a0(Object obj, String str) {
            this.f40628a = obj;
            this.f40629b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewRect(this.f40628a, this.f40629b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$a1 */
    class RunnableC14091a1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40631a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40632b;

        RunnableC14091a1(Object obj, String str) {
            this.f40631a = obj;
            this.f40632b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerUpdateFrame(this.f40631a, this.f40632b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$a2 */
    class RunnableC14092a2 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40634a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40635b;

        RunnableC14092a2(Object obj, String str) {
            this.f40634a = obj;
            this.f40635b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getRewardUnitSetting(this.f40634a, this.f40635b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$b */
    class RunnableC14093b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40637a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40638b;

        RunnableC14093b(Object obj, String str) {
            this.f40637a = obj;
            this.f40638b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getCurrentProgress(this.f40637a, this.f40638b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$b0 */
    class RunnableC14094b0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40640a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40641b;

        RunnableC14094b0(Object obj, String str) {
            this.f40640a = obj;
            this.f40641b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.removeFromSuperView(this.f40640a, this.f40641b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$b1 */
    class RunnableC14095b1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40643a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40644b;

        RunnableC14095b1(Object obj, String str) {
            this.f40643a = obj;
            this.f40644b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerMute(this.f40643a, this.f40644b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$b2 */
    class RunnableC14096b2 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40646a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40647b;

        RunnableC14096b2(Object obj, String str) {
            this.f40646a = obj;
            this.f40647b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getUnitSetting(this.f40646a, this.f40647b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$c */
    class RunnableC14097c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40649a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40650b;

        RunnableC14097c(Object obj, String str) {
            this.f40649a = obj;
            this.f40650b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showVideoClickView(this.f40649a, this.f40650b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$c0 */
    class RunnableC14098c0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40652a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40653b;

        RunnableC14098c0(Object obj, String str) {
            this.f40652a = obj;
            this.f40653b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.appendSubView(this.f40652a, this.f40653b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$c1 */
    class RunnableC14099c1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40655a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40656b;

        RunnableC14099c1(Object obj, String str) {
            this.f40655a = obj;
            this.f40656b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showVideoLocation(this.f40655a, this.f40656b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$c2 */
    class RunnableC14100c2 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40658a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40659b;

        RunnableC14100c2(Object obj, String str) {
            this.f40658a = obj;
            this.f40659b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getEncryptPrice(this.f40658a, this.f40659b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$d */
    class RunnableC14101d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40661a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40662b;

        RunnableC14101d(Object obj, String str) {
            this.f40661a = obj;
            this.f40662b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setScaleFitXY(this.f40661a, this.f40662b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$d0 */
    class RunnableC14102d0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40664a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40665b;

        RunnableC14102d0(Object obj, String str) {
            this.f40664a = obj;
            this.f40665b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.appendViewTo(this.f40664a, this.f40665b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$d1 */
    class RunnableC14103d1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40667a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40668b;

        RunnableC14103d1(Object obj, String str) {
            this.f40667a = obj;
            this.f40668b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerUnmute(this.f40667a, this.f40668b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$d2 */
    class RunnableC14104d2 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40670a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40671b;

        RunnableC14104d2(Object obj, String str) {
            this.f40670a = obj;
            this.f40671b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeVideoOperte(this.f40670a, this.f40671b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$e */
    class RunnableC14105e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40673a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40674b;

        RunnableC14105e(Object obj, String str) {
            this.f40673a = obj;
            this.f40674b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.notifyCloseBtn(this.f40673a, this.f40674b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$e0 */
    class RunnableC14106e0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40676a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40677b;

        RunnableC14106e0(Object obj, String str) {
            this.f40676a = obj;
            this.f40677b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyAppendSubView(this.f40676a, this.f40677b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$e1 */
    class RunnableC14107e1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40679a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40680b;

        RunnableC14107e1(Object obj, String str) {
            this.f40679a = obj;
            this.f40680b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerGetMuteState(this.f40679a, this.f40680b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$e2 */
    class RunnableC14108e2 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40682a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40683b;

        RunnableC14108e2(Object obj, String str) {
            this.f40682a = obj;
            this.f40683b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.progressOperate(this.f40682a, this.f40683b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$f */
    class RunnableC14109f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40685a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40686b;

        RunnableC14109f(Object obj, String str) {
            this.f40685a = obj;
            this.f40686b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.toggleCloseBtn(this.f40685a, this.f40686b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$f0 */
    class RunnableC14110f0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40688a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40689b;

        RunnableC14110f0(Object obj, String str) {
            this.f40688a = obj;
            this.f40689b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyAppendViewTo(this.f40688a, this.f40689b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$f1 */
    /* JADX INFO: loaded from: classes9.dex */
    class RunnableC14111f1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40691a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40692b;

        RunnableC14111f1(Object obj, String str) {
            this.f40691a = obj;
            this.f40692b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerSetSource(this.f40691a, this.f40692b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$g */
    class RunnableC14112g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40694a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40695b;

        RunnableC14112g(Object obj, String str) {
            this.f40694a = obj;
            this.f40695b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.handlerH5Exception(this.f40694a, this.f40695b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$g0 */
    class RunnableC14113g0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40697a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40698b;

        RunnableC14113g0(Object obj, String str) {
            this.f40697a = obj;
            this.f40698b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.statistics(this.f40697a, this.f40698b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$g1 */
    class RunnableC14114g1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40700a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40701b;

        RunnableC14114g1(Object obj, String str) {
            this.f40700a = obj;
            this.f40701b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerSetRenderType(this.f40700a, this.f40701b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$h */
    class RunnableC14115h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40703a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40704b;

        RunnableC14115h(Object obj, String str) {
            this.f40703a = obj;
            this.f40704b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.isSystemResume(this.f40703a, this.f40704b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$h0 */
    class RunnableC14116h0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40706a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40707b;

        RunnableC14116h0(Object obj, String str) {
            this.f40706a = obj;
            this.f40707b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.bringViewToFront(this.f40706a, this.f40707b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$h1 */
    class RunnableC14117h1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40709a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40710b;

        RunnableC14117h1(Object obj, String str) {
            this.f40709a = obj;
            this.f40710b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.preloadSubPlayTemplateView(this.f40709a, this.f40710b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$i */
    class RunnableC14118i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40712a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40713b;

        RunnableC14118i(Object obj, String str) {
            this.f40712a = obj;
            this.f40713b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.readyStatus(this.f40712a, this.f40713b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$i0 */
    class RunnableC14119i0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40715a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40716b;

        RunnableC14119i0(Object obj, String str) {
            this.f40715a = obj;
            this.f40716b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.hideView(this.f40715a, this.f40716b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$i1 */
    class RunnableC14120i1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40718a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40719b;

        RunnableC14120i1(Object obj, String str) {
            this.f40718a = obj;
            this.f40719b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeAd(this.f40718a, this.f40719b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$j */
    class RunnableC14121j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40721a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40722b;

        RunnableC14121j(Object obj, String str) {
            this.f40721a = obj;
            this.f40722b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playVideoFinishOperate(this.f40721a, this.f40722b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$j0 */
    class RunnableC14122j0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40724a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40725b;

        RunnableC14122j0(Object obj, String str) {
            this.f40724a = obj;
            this.f40725b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showView(this.f40724a, this.f40725b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$j1 */
    class RunnableC14123j1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40727a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40728b;

        RunnableC14123j1(Object obj, String str) {
            this.f40727a = obj;
            this.f40728b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.broadcast(this.f40727a, this.f40728b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$k */
    class RunnableC14124k implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40730a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40731b;

        RunnableC14124k(Object obj, String str) {
            this.f40730a = obj;
            this.f40731b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.init(this.f40730a, this.f40731b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$k0 */
    class RunnableC14125k0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40733a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40734b;

        RunnableC14125k0(Object obj, String str) {
            this.f40733a = obj;
            this.f40734b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewBgColor(this.f40733a, this.f40734b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$k1 */
    class RunnableC14126k1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40736a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40737b;

        RunnableC14126k1(Object obj, String str) {
            this.f40736a = obj;
            this.f40737b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.ivRewardAdsWithoutVideo(this.f40736a, this.f40737b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$l */
    class RunnableC14127l implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40739a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40740b;

        RunnableC14127l(Object obj, String str) {
            this.f40739a = obj;
            this.f40740b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.openURL(this.f40739a, this.f40740b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$l0 */
    class RunnableC14128l0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40742a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40743b;

        RunnableC14128l0(Object obj, String str) {
            this.f40742a = obj;
            this.f40743b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewAlpha(this.f40742a, this.f40743b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$l1 */
    class RunnableC14129l1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40745a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40746b;

        RunnableC14129l1(Object obj, String str) {
            this.f40745a = obj;
            this.f40746b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setSubPlayTemplateInfo(this.f40745a, this.f40746b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$m */
    class RunnableC14130m implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40748a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40749b;

        RunnableC14130m(Object obj, String str) {
            this.f40748a = obj;
            this.f40749b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showAlertView(this.f40748a, this.f40749b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$m0 */
    class RunnableC14131m0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40751a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40752b;

        RunnableC14131m0(Object obj, String str) {
            this.f40751a = obj;
            this.f40752b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewScale(this.f40751a, this.f40752b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$m1 */
    class RunnableC14132m1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40754a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40755b;

        RunnableC14132m1(Object obj, String str) {
            this.f40754a = obj;
            this.f40755b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewFireEvent(this.f40754a, this.f40755b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$n */
    class RunnableC14133n implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40757a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40758b;

        RunnableC14133n(Object obj, String str) {
            this.f40757a = obj;
            this.f40758b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeWeb(this.f40757a, this.f40758b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$n0 */
    class RunnableC14134n0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40760a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40761b;

        RunnableC14134n0(Object obj, String str) {
            this.f40760a = obj;
            this.f40761b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.insertViewAbove(this.f40760a, this.f40761b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$n1 */
    class RunnableC14135n1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40763a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40764b;

        RunnableC14135n1(Object obj, String str) {
            this.f40763a = obj;
            this.f40764b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.soundOperate(this.f40763a, this.f40764b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$o */
    class RunnableC14136o implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40766a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40767b;

        RunnableC14136o(Object obj, String str) {
            this.f40766a = obj;
            this.f40767b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getSDKInfo(this.f40766a, this.f40767b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$o0 */
    class RunnableC14137o0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40769a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40770b;

        RunnableC14137o0(Object obj, String str) {
            this.f40769a = obj;
            this.f40770b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.insertViewBelow(this.f40769a, this.f40770b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$o1 */
    class RunnableC14138o1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40772a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40773b;

        RunnableC14138o1(Object obj, String str) {
            this.f40772a = obj;
            this.f40773b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.increaseOfferFrequence(this.f40772a, this.f40773b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$p */
    class RunnableC14139p implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40775a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40776b;

        RunnableC14139p(Object obj, String str) {
            this.f40775a = obj;
            this.f40776b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getFileInfo(this.f40775a, this.f40776b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$p0 */
    class RunnableC14140p0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40778a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40779b;

        RunnableC14140p0(Object obj, String str) {
            this.f40778a = obj;
            this.f40779b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyInsertViewAbove(this.f40778a, this.f40779b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$p1 */
    class RunnableC14141p1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40781a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40782b;

        RunnableC14141p1(Object obj, String str) {
            this.f40781a = obj;
            this.f40782b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.handleNativeObject(this.f40781a, this.f40782b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$q */
    class RunnableC14142q implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40784a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40785b;

        RunnableC14142q(Object obj, String str) {
            this.f40784a = obj;
            this.f40785b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.loadads(this.f40784a, this.f40785b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$q0 */
    class RunnableC14143q0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40787a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40788b;

        RunnableC14143q0(Object obj, String str) {
            this.f40787a = obj;
            this.f40788b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyInsertViewBelow(this.f40787a, this.f40788b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$q1 */
    class RunnableC14144q1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40790a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40791b;

        RunnableC14144q1(Object obj, String str) {
            this.f40790a = obj;
            this.f40791b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.loadingResourceStatus(this.f40790a, this.f40791b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$r */
    class RunnableC14145r implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40793a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40794b;

        RunnableC14145r(Object obj, String str) {
            this.f40793a = obj;
            this.f40794b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.reactDeveloper(this.f40793a, this.f40794b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$r0 */
    class RunnableC14146r0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40796a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40797b;

        RunnableC14146r0(Object obj, String str) {
            this.f40796a = obj;
            this.f40797b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.triggerCloseBtn(this.f40796a, this.f40797b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$r1 */
    class RunnableC14147r1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40799a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40800b;

        RunnableC14147r1(Object obj, String str) {
            this.f40799a = obj;
            this.f40800b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createNativeEC(this.f40799a, this.f40800b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$s */
    class RunnableC14148s implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40802a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40803b;

        RunnableC14148s(Object obj, String str) {
            this.f40802a = obj;
            this.f40803b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.reportUrls(this.f40802a, this.f40803b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$s0 */
    class RunnableC14149s0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40805a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40806b;

        RunnableC14149s0(Object obj, String str) {
            this.f40805a = obj;
            this.f40806b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewLoad(this.f40805a, this.f40806b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$s1 */
    class RunnableC14150s1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40808a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40809b;

        RunnableC14150s1(Object obj, String str) {
            this.f40808a = obj;
            this.f40809b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setCacheItem(this.f40808a, this.f40809b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$t */
    class RunnableC14151t implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40811a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40812b;

        RunnableC14151t(Object obj, String str) {
            this.f40811a = obj;
            this.f40812b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createWebview(this.f40811a, this.f40812b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$t0 */
    class RunnableC14152t0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40814a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40815b;

        RunnableC14152t0(Object obj, String str) {
            this.f40814a = obj;
            this.f40815b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewReload(this.f40814a, this.f40815b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$t1 */
    class RunnableC14153t1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40817a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40818b;

        RunnableC14153t1(Object obj, String str) {
            this.f40817a = obj;
            this.f40818b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.removeCacheItem(this.f40817a, this.f40818b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$u */
    class RunnableC14154u implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40820a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40821b;

        RunnableC14154u(Object obj, String str) {
            this.f40820a = obj;
            this.f40821b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createView(this.f40820a, this.f40821b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$u0 */
    class RunnableC14155u0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40823a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40824b;

        RunnableC14155u0(Object obj, String str) {
            this.f40823a = obj;
            this.f40824b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewGoBack(this.f40823a, this.f40824b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$u1 */
    class RunnableC14156u1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40826a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40827b;

        RunnableC14156u1(Object obj, String str) {
            this.f40826a = obj;
            this.f40827b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getAllCache(this.f40826a, this.f40827b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$v */
    class RunnableC14157v implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40829a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40830b;

        RunnableC14157v(Object obj, String str) {
            this.f40829a = obj;
            this.f40830b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.click(this.f40829a, this.f40830b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$v0 */
    class RunnableC14158v0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40832a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40833b;

        RunnableC14158v0(Object obj, String str) {
            this.f40832a = obj;
            this.f40833b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewGoForward(this.f40832a, this.f40833b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$v1 */
    class RunnableC14159v1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40835a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40836b;

        RunnableC14159v1(Object obj, String str) {
            this.f40835a = obj;
            this.f40836b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.clearAllCache(this.f40835a, this.f40836b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$w */
    class RunnableC14160w implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40838a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40839b;

        RunnableC14160w(Object obj, String str) {
            this.f40838a = obj;
            this.f40839b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createPlayerView(this.f40838a, this.f40839b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$w0 */
    class RunnableC14161w0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40841a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40842b;

        RunnableC14161w0(Object obj, String str) {
            this.f40841a = obj;
            this.f40842b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerPlay(this.f40841a, this.f40842b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$w1 */
    class RunnableC14162w1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40844a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40845b;

        RunnableC14162w1(Object obj, String str) {
            this.f40844a = obj;
            this.f40845b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getCutout(this.f40844a, this.f40845b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$x */
    class RunnableC14163x implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40847a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40848b;

        RunnableC14163x(Object obj, String str) {
            this.f40847a = obj;
            this.f40848b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createSubPlayTemplateView(this.f40847a, this.f40848b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$x0 */
    class RunnableC14164x0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40850a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40851b;

        RunnableC14164x0(Object obj, String str) {
            this.f40850a = obj;
            this.f40851b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerPause(this.f40850a, this.f40851b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$x1 */
    class RunnableC14165x1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40853a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40854b;

        RunnableC14165x1(Object obj, String str) {
            this.f40853a = obj;
            this.f40854b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getAppSetting(this.f40853a, this.f40854b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$y */
    class RunnableC14166y implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40856a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40857b;

        RunnableC14166y(Object obj, String str) {
            this.f40856a = obj;
            this.f40857b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.destroyComponent(this.f40856a, this.f40857b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$y0 */
    class RunnableC14167y0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40859a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40860b;

        RunnableC14167y0(Object obj, String str) {
            this.f40859a = obj;
            this.f40860b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerResume(this.f40859a, this.f40860b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$y1 */
    class RunnableC14168y1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40862a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40863b;

        RunnableC14168y1(Object obj, String str) {
            this.f40862a = obj;
            this.f40863b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.videoOperate(this.f40862a, this.f40863b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$z */
    class RunnableC14169z implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40865a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40866b;

        RunnableC14169z(Object obj, String str) {
            this.f40865a = obj;
            this.f40866b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getComponentOptions(this.f40865a, this.f40866b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$z0 */
    class RunnableC14170z0 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40868a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40869b;

        RunnableC14170z0(Object obj, String str) {
            this.f40868a = obj;
            this.f40869b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerStop(this.f40868a, this.f40869b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.VideoCommunication$z1 */
    class RunnableC14171z1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40871a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40872b;

        RunnableC14171z1(Object obj, String str) {
            this.f40871a = obj;
            this.f40872b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getRewardSetting(this.f40871a, this.f40872b);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendSubView(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.appendSubView(obj, str);
        } else {
            this.f40624i.post(new RunnableC14098c0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendViewTo(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.appendViewTo(obj, str);
        } else {
            this.f40624i.post(new RunnableC14102d0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void bringViewToFront(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.bringViewToFront(obj, str);
        } else {
            this.f40624i.post(new RunnableC14116h0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void broadcast(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.broadcast(obj, str);
        } else {
            this.f40624i.post(new RunnableC14123j1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void clearAllCache(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.clearAllCache(obj, str);
        } else {
            this.f40624i.post(new RunnableC14159v1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void click(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.click(obj, str);
        } else {
            this.f40624i.post(new RunnableC14157v(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeAd(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.closeAd(obj, str);
        } else {
            this.f40624i.post(new RunnableC14120i1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeVideoOperte(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.closeVideoOperte(obj, str);
        } else {
            this.f40624i.post(new RunnableC14104d2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeWeb(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.closeWeb(obj, str);
            return;
        }
        this.f40624i.post(new RunnableC14133n(obj, str));
        C13219q0.m37816b("JS-Video-Brigde", "type" + str);
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createNativeEC(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.createNativeEC(obj, str);
        } else {
            this.f40624i.post(new RunnableC14147r1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createPlayerView(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.createPlayerView(obj, str);
        } else {
            this.f40624i.post(new RunnableC14160w(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createSubPlayTemplateView(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.createSubPlayTemplateView(obj, str);
        } else {
            this.f40624i.post(new RunnableC14163x(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createView(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.createView(obj, str);
        } else {
            this.f40624i.post(new RunnableC14154u(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createWebview(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.createWebview(obj, str);
        } else {
            this.f40624i.post(new RunnableC14151t(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void destroyComponent(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.destroyComponent(obj, str);
        } else {
            this.f40624i.post(new RunnableC14166y(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAllCache(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.getAllCache(obj, str);
        } else {
            this.f40624i.post(new RunnableC14156u1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAppSetting(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.getAppSetting(obj, str);
        } else {
            this.f40624i.post(new RunnableC14165x1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getComponentOptions(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.getComponentOptions(obj, str);
        } else {
            this.f40624i.post(new RunnableC14169z(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCurrentProgress(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.getCurrentProgress(obj, str);
        } else {
            this.f40624i.post(new RunnableC14093b(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCutout(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.getCutout(obj, str);
        } else {
            this.f40624i.post(new RunnableC14162w1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getEncryptPrice(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.getEncryptPrice(obj, str);
        } else {
            this.f40624i.post(new RunnableC14100c2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getFileInfo(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.getFileInfo(obj, str);
        } else {
            this.f40624i.post(new RunnableC14139p(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardSetting(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.getRewardSetting(obj, str);
        } else {
            this.f40624i.post(new RunnableC14171z1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardUnitSetting(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.getRewardUnitSetting(obj, str);
        } else {
            this.f40624i.post(new RunnableC14092a2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getSDKInfo(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.getSDKInfo(obj, str);
        } else {
            this.f40624i.post(new RunnableC14136o(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getUnitSetting(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.getUnitSetting(obj, str);
        } else {
            this.f40624i.post(new RunnableC14096b2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handleNativeObject(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.handleNativeObject(obj, str);
        } else {
            this.f40624i.post(new RunnableC14141p1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handlerH5Exception(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.handlerH5Exception(obj, str);
        } else {
            this.f40624i.post(new RunnableC14112g(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void hideView(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.hideView(obj, str);
        } else {
            this.f40624i.post(new RunnableC14119i0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void increaseOfferFrequence(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.increaseOfferFrequence(obj, str);
        } else {
            this.f40624i.post(new RunnableC14138o1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void init(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.init(obj, str);
        } else {
            this.f40624i.post(new RunnableC14124k(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewAbove(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.insertViewAbove(obj, str);
        } else {
            this.f40624i.post(new RunnableC14134n0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewBelow(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.insertViewBelow(obj, str);
        } else {
            this.f40624i.post(new RunnableC14137o0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void isSystemResume(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.isSystemResume(obj, str);
        } else {
            this.f40624i.post(new RunnableC14115h(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.ivRewardAdsWithoutVideo(obj, str);
        } else {
            this.f40624i.post(new RunnableC14126k1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadads(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.loadads(obj, str);
        } else {
            this.f40624i.post(new RunnableC14142q(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadingResourceStatus(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.loadingResourceStatus(obj, str);
        } else {
            this.f40624i.post(new RunnableC14144q1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void notifyCloseBtn(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.f40624i.post(new RunnableC14105e(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendSubView(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.onlyAppendSubView(obj, str);
        } else {
            this.f40624i.post(new RunnableC14106e0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendViewTo(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.onlyAppendViewTo(obj, str);
        } else {
            this.f40624i.post(new RunnableC14110f0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewAbove(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.onlyInsertViewAbove(obj, str);
        } else {
            this.f40624i.post(new RunnableC14140p0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewBelow(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.onlyInsertViewBelow(obj, str);
        } else {
            this.f40624i.post(new RunnableC14143q0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void openURL(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.openURL(obj, str);
        } else {
            this.f40624i.post(new RunnableC14127l(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playVideoFinishOperate(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.playVideoFinishOperate(obj, str);
        } else {
            this.f40624i.post(new RunnableC14121j(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerGetMuteState(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.playerGetMuteState(obj, str);
        } else {
            this.f40624i.post(new RunnableC14107e1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerMute(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.playerMute(obj, str);
        } else {
            this.f40624i.post(new RunnableC14095b1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPause(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.playerPause(obj, str);
        } else {
            this.f40624i.post(new RunnableC14164x0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPlay(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.playerPlay(obj, str);
        } else {
            this.f40624i.post(new RunnableC14161w0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerResume(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.playerResume(obj, str);
        } else {
            this.f40624i.post(new RunnableC14167y0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetRenderType(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.playerSetRenderType(obj, str);
        } else {
            this.f40624i.post(new RunnableC14114g1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetSource(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.playerSetSource(obj, str);
        } else {
            this.f40624i.post(new RunnableC14111f1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerStop(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.playerStop(obj, str);
        } else {
            this.f40624i.post(new RunnableC14170z0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUnmute(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.playerUnmute(obj, str);
        } else {
            this.f40624i.post(new RunnableC14103d1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUpdateFrame(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.playerUpdateFrame(obj, str);
        } else {
            this.f40624i.post(new RunnableC14091a1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void preloadSubPlayTemplateView(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.preloadSubPlayTemplateView(obj, str);
        } else {
            this.f40624i.post(new RunnableC14117h1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressBarOperate(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.progressBarOperate(obj, str);
        } else {
            this.f40624i.post(new RunnableC14089a(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressOperate(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.progressOperate(obj, str);
        } else {
            this.f40624i.post(new RunnableC14108e2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reactDeveloper(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.reactDeveloper(obj, str);
        } else {
            this.f40624i.post(new RunnableC14145r(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void readyStatus(Object obj, String str) {
        C13219q0.m37818c("JS-Video-Brigde", "VIDEOBridge readyStatus");
        if (C13229v0.m37934h()) {
            super.readyStatus(obj, str);
        } else {
            this.f40624i.post(new RunnableC14118i(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeCacheItem(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.removeCacheItem(obj, str);
        } else {
            this.f40624i.post(new RunnableC14153t1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeFromSuperView(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.removeFromSuperView(obj, str);
        } else {
            this.f40624i.post(new RunnableC14094b0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reportUrls(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.reportUrls(obj, str);
        } else {
            this.f40624i.post(new RunnableC14148s(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setCacheItem(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.setCacheItem(obj, str);
        } else {
            this.f40624i.post(new RunnableC14150s1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setScaleFitXY(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.setScaleFitXY(obj, str);
        } else {
            this.f40624i.post(new RunnableC14101d(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setSubPlayTemplateInfo(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.setSubPlayTemplateInfo(obj, str);
        } else {
            this.f40624i.post(new RunnableC14129l1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewAlpha(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.setViewAlpha(obj, str);
        } else {
            this.f40624i.post(new RunnableC14128l0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewBgColor(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.setViewBgColor(obj, str);
        } else {
            this.f40624i.post(new RunnableC14125k0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewRect(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.setViewRect(obj, str);
        } else {
            this.f40624i.post(new RunnableC14090a0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewScale(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.setViewScale(obj, str);
        } else {
            this.f40624i.post(new RunnableC14131m0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showAlertView(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.showAlertView(obj, str);
        } else {
            this.f40624i.post(new RunnableC14130m(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoClickView(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.showVideoClickView(obj, str);
        } else {
            this.f40624i.post(new RunnableC14097c(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoLocation(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.showVideoLocation(obj, str);
        } else {
            this.f40624i.post(new RunnableC14099c1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showView(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.showView(obj, str);
        } else {
            this.f40624i.post(new RunnableC14122j0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void soundOperate(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.soundOperate(obj, str);
        } else {
            this.f40624i.post(new RunnableC14135n1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void statistics(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.statistics(obj, str);
        } else {
            this.f40624i.post(new RunnableC14113g0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void toggleCloseBtn(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.f40624i.post(new RunnableC14109f(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void triggerCloseBtn(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.f40624i.post(new RunnableC14146r0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void videoOperate(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.videoOperate(obj, str);
        } else {
            this.f40624i.post(new RunnableC14168y1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewFireEvent(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.webviewFireEvent(obj, str);
        } else {
            this.f40624i.post(new RunnableC14132m1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoBack(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.webviewGoBack(obj, str);
        } else {
            this.f40624i.post(new RunnableC14155u0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoForward(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.webviewGoForward(obj, str);
        } else {
            this.f40624i.post(new RunnableC14158v0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewLoad(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.webviewLoad(obj, str);
        } else {
            this.f40624i.post(new RunnableC14149s0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewReload(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.webviewReload(obj, str);
        } else {
            this.f40624i.post(new RunnableC14152t0(obj, str));
        }
    }
}
