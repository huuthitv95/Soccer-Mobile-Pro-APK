package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.x */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12097x<T> extends AbstractC12098y<WebView, T> {

    /* JADX INFO: renamed from: ﻛ */
    private AbstractViewOnLayoutChangeListenerC11812ad f30007;

    /* JADX INFO: renamed from: ｋ */
    private InterfaceC12043is f30008;

    /* JADX INFO: renamed from: ﾇ */
    private Map<T, AbstractViewOnLayoutChangeListenerC11812ad> f30009 = new WeakHashMap();

    /* JADX INFO: renamed from: ﾒ */
    private AbstractC12097x<T>.b f30010 = new b();

    /* JADX INFO: renamed from: ﻐ */
    abstract AbstractViewOnLayoutChangeListenerC11812ad mo28273();

    /* JADX INFO: renamed from: ﻛ */
    abstract void mo28275(T t, List<WebView> list);

    /* JADX INFO: renamed from: ｋ */
    abstract InterfaceC12090q<WebView, T> mo28276();

    /* JADX INFO: renamed from: ﾇ */
    abstract View mo28277(T t);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12098y, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
    /* JADX INFO: renamed from: ﻛ */
    public final /* synthetic */ void mo28227(JSONObject jSONObject, Object obj, Object obj2) {
        super.mo28229(jSONObject, (WebView) obj, obj2);
    }

    public AbstractC12097x(InterfaceC12043is interfaceC12043is) {
        this.f30008 = interfaceC12043is;
    }

    /* JADX INFO: renamed from: ﻐ */
    final void m31072(InterfaceC12043is interfaceC12043is) {
        this.f30008 = interfaceC12043is;
    }

    /* JADX INFO: renamed from: ﻐ */
    final void m31073(AbstractC12097x<T>.b bVar) {
        this.f30010 = bVar;
    }

    /* JADX INFO: renamed from: ﻐ */
    void mo31048(T t, String str) {
        m31074(new JSONObject(), (Object) t, str);
    }

    /* JADX INFO: renamed from: ﾇ */
    final void m31074(final JSONObject jSONObject, final T t, String str) {
        AbstractViewOnLayoutChangeListenerC11812ad abstractViewOnLayoutChangeListenerC11812adMo28273;
        boolean z = ((b) this.f30010).f30029 && !TextUtils.isEmpty(((b) this.f30010).f30031);
        if (((b) this.f30010).f30026) {
            abstractViewOnLayoutChangeListenerC11812adMo28273 = this.f30009.get(t);
        } else {
            abstractViewOnLayoutChangeListenerC11812adMo28273 = this.f30007;
        }
        if (abstractViewOnLayoutChangeListenerC11812adMo28273 == null) {
            abstractViewOnLayoutChangeListenerC11812adMo28273 = mo28273();
            if (((b) this.f30010).f30026) {
                this.f30009.put(t, abstractViewOnLayoutChangeListenerC11812adMo28273);
            } else {
                this.f30007 = abstractViewOnLayoutChangeListenerC11812adMo28273;
            }
            abstractViewOnLayoutChangeListenerC11812adMo28273.m31102((InterfaceC12090q) mo28276());
        }
        AbstractViewOnLayoutChangeListenerC11812ad abstractViewOnLayoutChangeListenerC11812ad = abstractViewOnLayoutChangeListenerC11812adMo28273;
        abstractViewOnLayoutChangeListenerC11812ad.m28303();
        abstractViewOnLayoutChangeListenerC11812ad.m28302(((b) this.f30010).f30031, ((b) this.f30010).f30027, z, ((b) this.f30010).f30025, ((b) this.f30010).f30022);
        abstractViewOnLayoutChangeListenerC11812ad.m28304(str);
        if (((b) this.f30010).f30024) {
            ArrayList arrayList = new ArrayList();
            mo28275(t, arrayList);
            List<WebView> arrayList2 = new ArrayList<>();
            InterfaceC12043is interfaceC12043is = this.f30008;
            if (interfaceC12043is != null) {
                arrayList2 = interfaceC12043is.mo29720(t);
            }
            final List<WebView> listM30749 = C12072ju.m30749(arrayList, arrayList2);
            if (listM30749.isEmpty() || ((b) this.f30010).f30023) {
                View viewMo28277 = mo28277(t);
                if (viewMo28277 != null) {
                    viewMo28277.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.x.4

                        /* JADX INFO: renamed from: ﻏ */
                        private static int f30015 = 1;

                        /* JADX INFO: renamed from: ﻐ */
                        private static char f30016 = 5;

                        /* JADX INFO: renamed from: ﻛ */
                        private static int f30017;

                        /* JADX INFO: renamed from: ﾒ */
                        private static char[] f30018 = {'F', AbstractJsonLexerKt.UNICODE_ESC, 'l', 's', 'c', 'r', 'e', 'n', 'A', 'd', 'H', 'a', 'E', 'o', ' ', 'i', 'L', 'y', 't', 'C', 'h', 'g', 'G', 'I', 'J'};

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            int i9 = 2 % 2;
                            try {
                                ArrayList arrayList3 = new ArrayList();
                                AbstractC12097x.this.mo28275(t, arrayList3);
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                View viewMo28278 = AbstractC12097x.this.mo28277(t);
                                if (viewMo28278 != null && !AbstractC12097x.this.f30010.f30023) {
                                    int i10 = f30017 + 83;
                                    f30015 = i10 % 128;
                                    if (i10 % 2 == 0) {
                                        viewMo28278.removeOnLayoutChangeListener(this);
                                        throw null;
                                    }
                                    viewMo28278.removeOnLayoutChangeListener(this);
                                }
                                AbstractC12097x.this.m31069(t, arrayList3);
                                AbstractC12097x.this.mo28231(new JSONObject(), arrayList3.get(0), t);
                                int i11 = f30017 + 27;
                                f30015 = i11 % 128;
                                int i12 = i11 % 2;
                            } catch (Throwable th) {
                                C12080kb.m30845(m31075((byte) (122 - TextUtils.getOffsetAfter("", 0)), "\u0001\u0002ææ\u0004\u0000\u0006\u0007\u0007\b\t\u0005\u000b\f\b\u0005\u0001\u0007ì", View.resolveSize(0, 0) + 19).intern(), m31075((byte) (36 - Color.green(0)), "\n\u0007\b\n\t\n\u0011\u0005\n\u000e\u0006\u0011\f\u0010\u000b\u0003\u0013\u000f\u0015\n\u0006\u0016\u0089", 23 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), th, false);
                            }
                        }

                        /* JADX INFO: renamed from: ﻐ */
                        private static String m31075(byte b2, String str2, int i) {
                            String str3;
                            Object charArray = str2;
                            if (str2 != null) {
                                charArray = str2.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (C11970g.f28961) {
                                char[] cArr2 = f30018;
                                char c = f30016;
                                char[] cArr3 = new char[i];
                                if (i % 2 != 0) {
                                    i--;
                                    cArr3[i] = (char) (cArr[i] - b2);
                                }
                                if (i > 1) {
                                    C11970g.f28962 = 0;
                                    while (C11970g.f28962 < i) {
                                        C11970g.f28964 = cArr[C11970g.f28962];
                                        C11970g.f28965 = cArr[C11970g.f28962 + 1];
                                        if (C11970g.f28964 == C11970g.f28965) {
                                            cArr3[C11970g.f28962] = (char) (C11970g.f28964 - b2);
                                            cArr3[C11970g.f28962 + 1] = (char) (C11970g.f28965 - b2);
                                        } else {
                                            C11970g.f28963 = C11970g.f28964 / c;
                                            C11970g.f28959 = C11970g.f28964 % c;
                                            C11970g.f28966 = C11970g.f28965 / c;
                                            C11970g.f28960 = C11970g.f28965 % c;
                                            if (C11970g.f28959 == C11970g.f28960) {
                                                C11970g.f28963 = ((C11970g.f28963 + c) - 1) % c;
                                                C11970g.f28966 = ((C11970g.f28966 + c) - 1) % c;
                                                int i2 = (C11970g.f28963 * c) + C11970g.f28959;
                                                int i3 = (C11970g.f28966 * c) + C11970g.f28960;
                                                cArr3[C11970g.f28962] = cArr2[i2];
                                                cArr3[C11970g.f28962 + 1] = cArr2[i3];
                                            } else if (C11970g.f28963 == C11970g.f28966) {
                                                C11970g.f28959 = ((C11970g.f28959 + c) - 1) % c;
                                                C11970g.f28960 = ((C11970g.f28960 + c) - 1) % c;
                                                int i4 = (C11970g.f28963 * c) + C11970g.f28959;
                                                int i5 = (C11970g.f28966 * c) + C11970g.f28960;
                                                cArr3[C11970g.f28962] = cArr2[i4];
                                                cArr3[C11970g.f28962 + 1] = cArr2[i5];
                                            } else {
                                                int i6 = (C11970g.f28963 * c) + C11970g.f28960;
                                                int i7 = (C11970g.f28966 * c) + C11970g.f28959;
                                                cArr3[C11970g.f28962] = cArr2[i6];
                                                cArr3[C11970g.f28962 + 1] = cArr2[i7];
                                            }
                                        }
                                        C11970g.f28962 += 2;
                                    }
                                }
                                str3 = new String(cArr3);
                            }
                            return str3;
                        }
                    });
                }
                if (listM30749.isEmpty()) {
                    super.mo28227(jSONObject, null, t);
                    return;
                }
            }
            if (!((b) this.f30010).f30021) {
                m31069(t, listM30749);
                super.mo28227(jSONObject, listM30749.get(0), t);
                return;
            } else {
                C12089p.m30937().post(new Runnable() { // from class: com.ironsource.adqualitysdk.sdk.i.x.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC12097x.this.m31069(t, listM30749);
                        AbstractC12097x.super.mo28227(jSONObject, (WebView) listM30749.get(0), t);
                    }
                });
                return;
            }
        }
        super.mo28227(jSONObject, null, t);
    }

    /* JADX INFO: renamed from: ﻛ */
    void mo31051(T t) {
        AbstractViewOnLayoutChangeListenerC11812ad abstractViewOnLayoutChangeListenerC11812ad;
        JSONObject jSONObject = new JSONObject();
        if (((b) this.f30010).f30026) {
            abstractViewOnLayoutChangeListenerC11812ad = this.f30009.get(t);
        } else {
            abstractViewOnLayoutChangeListenerC11812ad = this.f30007;
        }
        mo28225(jSONObject, abstractViewOnLayoutChangeListenerC11812ad.m28300(), t);
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.x$b */
    public class b {

        /* JADX INFO: renamed from: ﮌ */
        private boolean f30021;

        /* JADX INFO: renamed from: ﮐ */
        private boolean f30022;

        /* JADX INFO: renamed from: ﱟ */
        private boolean f30023;

        /* JADX INFO: renamed from: ﱡ */
        private boolean f30024;

        /* JADX INFO: renamed from: ﺙ */
        private boolean f30025;

        /* JADX INFO: renamed from: ﻏ */
        private boolean f30026;

        /* JADX INFO: renamed from: ﻐ */
        private List<String> f30027;

        /* JADX INFO: renamed from: ﻛ */
        protected List<String> f30028 = new ArrayList();

        /* JADX INFO: renamed from: ｋ */
        private boolean f30029;

        /* JADX INFO: renamed from: ﾇ */
        private boolean f30030;

        /* JADX INFO: renamed from: ﾒ */
        private String f30031;

        /* JADX INFO: renamed from: ﻐ */
        public final AbstractC12097x<T>.b m31089(String str) {
            this.f30031 = str;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ */
        public final AbstractC12097x<T>.b m31095(List<String> list) {
            this.f30027 = list;
            return this;
        }

        /* JADX INFO: renamed from: ｋ */
        public final AbstractC12097x<T>.b m31093(boolean z) {
            this.f30030 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ */
        public final AbstractC12097x<T>.b m31092(boolean z) {
            this.f30029 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ */
        public final AbstractC12097x<T>.b m31091(boolean z) {
            this.f30023 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ */
        public final AbstractC12097x<T>.b m31096(boolean z) {
            this.f30024 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ */
        public final AbstractC12097x<T>.b m31094(boolean z) {
            this.f30025 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﱡ */
        public final AbstractC12097x<T>.b m31087(boolean z) {
            this.f30022 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﱟ */
        public final AbstractC12097x<T>.b m31086(boolean z) {
            this.f30026 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﺙ */
        public final AbstractC12097x<T>.b m31088(boolean z) {
            this.f30021 = z;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ */
        public final AbstractC12097x<T>.b m31090(List<String> list) {
            if (list != null) {
                this.f30028 = list;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ｋ */
    public void m31069(T t, List<WebView> list) {
        AbstractViewOnLayoutChangeListenerC11812ad abstractViewOnLayoutChangeListenerC11812ad;
        AbstractViewOnLayoutChangeListenerC11812ad abstractViewOnLayoutChangeListenerC11812ad2;
        if (((b) this.f30010).f30026) {
            abstractViewOnLayoutChangeListenerC11812ad = this.f30009.get(t);
        } else {
            abstractViewOnLayoutChangeListenerC11812ad = this.f30007;
        }
        abstractViewOnLayoutChangeListenerC11812ad.m28301(list);
        if (((b) this.f30010).f30030) {
            if (((b) this.f30010).f30026) {
                abstractViewOnLayoutChangeListenerC11812ad2 = this.f30009.get(t);
            } else {
                abstractViewOnLayoutChangeListenerC11812ad2 = this.f30007;
            }
            abstractViewOnLayoutChangeListenerC11812ad2.m28304(Integer.toHexString(list.get(0).hashCode()));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12098y
    /* JADX INFO: renamed from: ﻐ */
    protected final String mo28218(T t) {
        AbstractViewOnLayoutChangeListenerC11812ad abstractViewOnLayoutChangeListenerC11812ad;
        if (((b) this.f30010).f30026) {
            abstractViewOnLayoutChangeListenerC11812ad = this.f30009.get(t);
        } else {
            abstractViewOnLayoutChangeListenerC11812ad = this.f30007;
        }
        return abstractViewOnLayoutChangeListenerC11812ad.mo28218(t);
    }
}
