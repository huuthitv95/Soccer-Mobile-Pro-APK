package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.n8 */
/* JADX INFO: loaded from: classes6.dex */
public class C12386n8 {

    /* JADX INFO: renamed from: com.ironsource.n8$a */
    public enum a {
        None,
        Device,
        Controller
    }

    /* JADX INFO: renamed from: com.ironsource.n8$b */
    public enum b {
        None,
        Loading,
        Loaded,
        Ready,
        Failed
    }

    /* JADX INFO: renamed from: com.ironsource.n8$c */
    public enum c {
        Web,
        Native,
        None
    }

    /* JADX INFO: renamed from: com.ironsource.n8$d */
    public enum d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);


        /* JADX INFO: renamed from: a */
        private int f31553a;

        d(int i) {
            this.f31553a = i;
        }

        /* JADX INFO: renamed from: b */
        public int m32820b() {
            return this.f31553a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n8$e */
    public enum e {
        Banner,
        Interstitial,
        RewardedVideo,
        NativeAd,
        None
    }
}
