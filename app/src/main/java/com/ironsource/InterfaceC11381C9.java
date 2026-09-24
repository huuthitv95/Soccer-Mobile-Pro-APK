package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.C9 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC11381C9 extends InterfaceC11437Fb<Integer, Integer> {

    /* JADX INFO: renamed from: com.ironsource.C9$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f24144a = new a();

        /* JADX INFO: renamed from: b */
        public static final int f24145b = 2201;

        /* JADX INFO: renamed from: c */
        public static final int f24146c = 2203;

        /* JADX INFO: renamed from: d */
        public static final int f24147d = 2005;

        /* JADX INFO: renamed from: e */
        public static final int f24148e = 2210;

        /* JADX INFO: renamed from: f */
        public static final int f24149f = 2006;

        /* JADX INFO: renamed from: g */
        public static final int f24150g = 2204;

        /* JADX INFO: renamed from: h */
        public static final int f24151h = 2507;

        /* JADX INFO: renamed from: i */
        public static final int f24152i = 2211;

        /* JADX INFO: renamed from: j */
        public static final int f24153j = 2212;

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.C9$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final b f24154a = new b();

        /* JADX INFO: renamed from: b */
        public static final int f24155b = 2002;

        /* JADX INFO: renamed from: c */
        public static final int f24156c = 2003;

        /* JADX INFO: renamed from: d */
        public static final int f24157d = 2200;

        /* JADX INFO: renamed from: e */
        public static final int f24158e = 2503;

        /* JADX INFO: renamed from: f */
        public static final int f24159f = 2504;

        /* JADX INFO: renamed from: g */
        public static final int f24160g = 2300;

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.C9$c */
    public static final class c implements InterfaceC11381C9 {
        @Override // com.ironsource.InterfaceC11437Fb
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ Integer mo25577a(Integer num) {
            return m25576a(num.intValue());
        }

        /* JADX INFO: renamed from: a */
        public Integer m25576a(int i) throws IllegalArgumentException {
            int i2;
            if (i == 206) {
                i2 = b.f24158e;
            } else if (i == 207) {
                i2 = b.f24159f;
            } else if (i == 401) {
                i2 = a.f24145b;
            } else if (i == 410) {
                i2 = a.f24152i;
            } else if (i != 411) {
                switch (i) {
                    case 101:
                        i2 = d.f24162b;
                        break;
                    case 102:
                        i2 = d.f24163c;
                        break;
                    case 103:
                        i2 = d.f24168h;
                        break;
                    case 104:
                        i2 = d.f24164d;
                        break;
                    case 105:
                        i2 = d.f24165e;
                        break;
                    default:
                        switch (i) {
                            case 109:
                                i2 = 88002;
                                break;
                            case 110:
                                i2 = 83004;
                                break;
                            case 111:
                                i2 = d.f24169i;
                                break;
                            case 112:
                                i2 = d.f24170j;
                                break;
                            case 113:
                                i2 = d.f24171k;
                                break;
                            default:
                                switch (i) {
                                    case 201:
                                        i2 = 2002;
                                        break;
                                    case 202:
                                        i2 = 2003;
                                        break;
                                    case 203:
                                        i2 = b.f24157d;
                                        break;
                                    case 204:
                                        i2 = b.f24160g;
                                        break;
                                    default:
                                        switch (i) {
                                            case 403:
                                                i2 = a.f24146c;
                                                break;
                                            case 404:
                                                i2 = 2005;
                                                break;
                                            case 405:
                                                i2 = a.f24148e;
                                                break;
                                            case 406:
                                                i2 = 2006;
                                                break;
                                            case 407:
                                                i2 = a.f24150g;
                                                break;
                                            case 408:
                                                i2 = a.f24151h;
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Unknown event code: " + i);
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                i2 = a.f24153j;
            }
            return Integer.valueOf(i2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.C9$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public static final d f24161a = new d();

        /* JADX INFO: renamed from: b */
        public static final int f24162b = 82500;

        /* JADX INFO: renamed from: c */
        public static final int f24163c = 82510;

        /* JADX INFO: renamed from: d */
        public static final int f24164d = 82300;

        /* JADX INFO: renamed from: e */
        public static final int f24165e = 82002;

        /* JADX INFO: renamed from: f */
        public static final int f24166f = 83004;

        /* JADX INFO: renamed from: g */
        public static final int f24167g = 88002;

        /* JADX INFO: renamed from: h */
        public static final int f24168h = 82301;

        /* JADX INFO: renamed from: i */
        public static final int f24169i = 82302;

        /* JADX INFO: renamed from: j */
        public static final int f24170j = 82076;

        /* JADX INFO: renamed from: k */
        public static final int f24171k = 82077;

        private d() {
        }
    }
}
