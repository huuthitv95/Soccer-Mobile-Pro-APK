package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.C13229v0;

/* JADX INFO: loaded from: classes7.dex */
public class RewardSignal extends BaseRewardSignal implements BaseIRewardCommunication {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f40597i = 0;

    /* JADX INFO: renamed from: h */
    private Handler f40598h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.RewardSignal$a */
    class RunnableC14081a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40599a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40600b;

        RunnableC14081a(Object obj, String str) {
            this.f40599a = obj;
            this.f40600b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.getEndScreenInfo(this.f40599a, this.f40600b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.RewardSignal$b */
    class RunnableC14082b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40602a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40603b;

        RunnableC14082b(Object obj, String str) {
            this.f40602a = obj;
            this.f40603b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.install(this.f40602a, this.f40603b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.RewardSignal$c */
    class RunnableC14083c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40605a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40606b;

        RunnableC14083c(Object obj, String str) {
            this.f40605a = obj;
            this.f40606b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.notifyCloseBtn(this.f40605a, this.f40606b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.RewardSignal$d */
    class RunnableC14084d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40608a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40609b;

        RunnableC14084d(Object obj, String str) {
            this.f40608a = obj;
            this.f40609b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.toggleCloseBtn(this.f40608a, this.f40609b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.RewardSignal$e */
    class RunnableC14085e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40611a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40612b;

        RunnableC14085e(Object obj, String str) {
            this.f40611a = obj;
            this.f40612b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.getEndScreenInfo(this.f40611a, this.f40612b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.RewardSignal$f */
    class RunnableC14086f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40614a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40615b;

        RunnableC14086f(Object obj, String str) {
            this.f40614a = obj;
            this.f40615b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.setOrientation(this.f40614a, this.f40615b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.RewardSignal$g */
    class RunnableC14087g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40617a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40618b;

        RunnableC14087g(Object obj, String str) {
            this.f40617a = obj;
            this.f40618b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.handlerPlayableException(this.f40617a, this.f40618b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.communication.RewardSignal$h */
    class RunnableC14088h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f40620a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f40621b;

        RunnableC14088h(Object obj, String str) {
            this.f40620a = obj;
            this.f40621b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.openURL(this.f40620a, this.f40621b);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.getEndScreenInfo(obj, str);
        } else {
            this.f40598h.post(new RunnableC14081a(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.handlerPlayableException(obj, str);
        } else {
            this.f40598h.post(new RunnableC14087g(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.install(obj, str);
        } else {
            this.f40598h.post(new RunnableC14082b(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.f40598h.post(new RunnableC14083c(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.openURL(obj, str);
        } else {
            this.f40598h.post(new RunnableC14088h(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.setOrientation(obj, str);
        } else {
            this.f40598h.post(new RunnableC14086f(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.f40598h.post(new RunnableC14084d(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        if (C13229v0.m37934h()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.f40598h.post(new RunnableC14085e(obj, str));
        }
    }
}
