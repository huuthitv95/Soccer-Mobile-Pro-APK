package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.x */
/* JADX INFO: compiled from: TrackConfig.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13881x {

    /* JADX INFO: renamed from: a */
    public final int f39640a;

    /* JADX INFO: renamed from: b */
    public final int f39641b;

    /* JADX INFO: renamed from: c */
    public final int f39642c;

    /* JADX INFO: renamed from: d */
    public final int f39643d;

    /* JADX INFO: renamed from: e */
    public final int f39644e;

    /* JADX INFO: renamed from: f */
    public final int f39645f;

    /* JADX INFO: renamed from: g */
    public final C13873p f39646g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC13817d f39647h;

    /* JADX INFO: renamed from: i */
    public final AbstractC13880w f39648i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC13819f f39649j;

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.x$b */
    /* JADX INFO: compiled from: TrackConfig.java */
    public static final class b {

        /* JADX INFO: renamed from: d */
        private C13873p f39653d;

        /* JADX INFO: renamed from: h */
        private InterfaceC13817d f39657h;

        /* JADX INFO: renamed from: i */
        private AbstractC13880w f39658i;

        /* JADX INFO: renamed from: j */
        private InterfaceC13819f f39659j;

        /* JADX INFO: renamed from: a */
        private int f39650a = 50;

        /* JADX INFO: renamed from: b */
        private int f39651b = 15000;

        /* JADX INFO: renamed from: c */
        private int f39652c = 1;

        /* JADX INFO: renamed from: e */
        private int f39654e = 2;

        /* JADX INFO: renamed from: f */
        private int f39655f = 50;

        /* JADX INFO: renamed from: g */
        private int f39656g = 604800000;

        /* JADX INFO: renamed from: a */
        public b m41401a(int i) {
            if (i < 0) {
                this.f39656g = 604800000;
                return this;
            }
            this.f39656g = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m41402a(int i, C13873p c13873p) {
            this.f39652c = i;
            this.f39653d = c13873p;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m41403a(InterfaceC13817d interfaceC13817d) {
            this.f39657h = interfaceC13817d;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m41404a(InterfaceC13819f interfaceC13819f) {
            this.f39659j = interfaceC13819f;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m41405a(AbstractC13880w abstractC13880w) {
            this.f39658i = abstractC13880w;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C13881x m41406a() {
            if (C13882y.m41417b(this.f39657h) && C13814a.f39370a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (C13882y.m41417b(this.f39658i) && C13814a.f39370a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((C13882y.m41417b(this.f39653d) || C13882y.m41417b(this.f39653d.m41343b())) && C13814a.f39370a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new C13881x(this);
        }

        /* JADX INFO: renamed from: b */
        public b m41407b(int i) {
            if (i <= 0) {
                this.f39650a = 50;
                return this;
            }
            this.f39650a = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m41408c(int i) {
            if (i < 0) {
                this.f39651b = 15000;
                return this;
            }
            this.f39651b = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m41409d(int i) {
            if (i < 0) {
                this.f39655f = 50;
                return this;
            }
            this.f39655f = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m41410e(int i) {
            if (i <= 0) {
                this.f39654e = 2;
                return this;
            }
            this.f39654e = i;
            return this;
        }
    }

    private C13881x(b bVar) {
        this.f39640a = bVar.f39650a;
        this.f39641b = bVar.f39651b;
        this.f39642c = bVar.f39652c;
        this.f39643d = bVar.f39654e;
        this.f39644e = bVar.f39655f;
        this.f39645f = bVar.f39656g;
        this.f39646g = bVar.f39653d;
        this.f39647h = bVar.f39657h;
        this.f39648i = bVar.f39658i;
        this.f39649j = bVar.f39659j;
    }
}
