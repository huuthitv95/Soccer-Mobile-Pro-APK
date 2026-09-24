package com.bykv.p028vk.openvk.preload.geckox.p048g;

import android.util.Pair;
import com.bykv.p028vk.openvk.preload.falconx.p032a.C1896a;
import com.bykv.p028vk.openvk.preload.geckox.C1910b;
import com.bykv.p028vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.p028vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p028vk.openvk.preload.geckox.p037c.C1920a;
import com.bykv.p028vk.openvk.preload.geckox.p037c.C1929b;
import com.bykv.p028vk.openvk.preload.geckox.p037c.C1940c;
import com.bykv.p028vk.openvk.preload.geckox.p037c.C1942e;
import com.bykv.p028vk.openvk.preload.geckox.p037c.C1943f;
import com.bykv.p028vk.openvk.preload.geckox.p037c.C1944g;
import com.bykv.p028vk.openvk.preload.geckox.p037c.C1945h;
import com.bykv.p028vk.openvk.preload.geckox.p037c.C1946i;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p038a.p039a.C1921a;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p038a.p039a.C1922b;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p038a.p039a.C1923c;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p038a.p040b.C1924a;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p038a.p040b.C1925b;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p038a.p040b.C1926c;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p038a.p040b.C1927d;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p038a.p040b.C1928e;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p042a.C1930a;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p042a.C1931b;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p042a.C1932c;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p042a.C1933d;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p043b.C1934a;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p043b.C1935b;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p043b.C1936c;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p043b.C1937d;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p043b.C1938e;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p043b.C1939f;
import com.bykv.p028vk.openvk.preload.geckox.p044d.AbstractC1947a;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1894l;
import com.bykv.p028vk.openvk.preload.p029a.C1885c;
import com.bykv.p028vk.openvk.preload.p029a.C1888f;
import com.bykv.p028vk.openvk.preload.p029a.C1890h;
import com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b;
import com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a;
import com.bykv.p028vk.openvk.preload.p029a.p031b.C1884b;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.hbisoft.hbrecorder.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.g.a */
/* JADX INFO: compiled from: GeckoPipeline.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1956a {
    /* JADX INFO: renamed from: a */
    private static AbstractC1883a m6031a(final C1910b c1910b) {
        return new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.g.a.7
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5838a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5838a(interfaceC1882b, abstractC1886d);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + Constants.ON_START_KEY, "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onException", th.toString());
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onEnd", "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5841b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5841b(interfaceC1882b, abstractC1886d, th);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onChainException", th.toString());
                } catch (Throwable unused) {
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC1883a m6032a(AbstractC1947a abstractC1947a) {
        if (abstractC1947a == null) {
            return null;
        }
        return new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.g.a.3
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                interfaceC1882b.mo5835a(C1929b.class);
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                interfaceC1882b.mo5837b(C1929b.class);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC1883a m6033a(final AbstractC1947a abstractC1947a, final C1910b c1910b) {
        return new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.g.a.4
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5838a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5838a(interfaceC1882b, abstractC1886d);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + Constants.ON_START_KEY, "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                if (abstractC1947a != null) {
                    interfaceC1882b.mo5835a(C1929b.class);
                }
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onException", th.toString());
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onEnd", "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5841b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5841b(interfaceC1882b, abstractC1886d, th);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onChainException", th.toString());
                } catch (Throwable unused) {
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1882b<Object> m6034a(final AbstractC1947a abstractC1947a, File file, final C1910b c1910b, C1896a c1896a, Map<String, Map<String, Object>> map, Map<String, List<CheckRequestBodyModel.TargetChannel>> map2, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1890h.a.m5860a().m5865a(C1942e.class).m5866a(file, c1910b.m5926d()).m5864a(c1896a.m5883a(C1942e.class)).m5867b());
        arrayList.add(C1890h.a.m5860a().m5865a(C1940c.class).m5866a(c1910b, map, map2, abstractC1947a, str).m5864a(new C1884b(new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.g.a.6
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5838a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5838a(interfaceC1882b, abstractC1886d);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + Constants.ON_START_KEY, "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                interfaceC1882b.mo5835a(C1940c.class);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onException", th.toString());
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                List<UpdatePackage> list = (List) interfaceC1882b.mo5837b(C1940c.class);
                interfaceC1882b.mo5835a(C1940c.class);
                HashMap map3 = new HashMap();
                for (UpdatePackage updatePackage : list) {
                    String accessKey = updatePackage.getAccessKey();
                    List arrayList2 = (List) map3.get(accessKey);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(updatePackage);
                    map3.put(accessKey, arrayList2);
                }
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onEnd", "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5841b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5841b(interfaceC1882b, abstractC1886d, th);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onChainException", th.toString());
                } catch (Throwable unused) {
                }
            }
        }, c1896a.m5883a(C1940c.class))).m5867b());
        arrayList.add(C1890h.a.m5860a().m5865a(C1943f.class).m5866a(C1910b.m5919g()).m5864a(new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.g.a.1
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5838a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5838a(interfaceC1882b, abstractC1886d);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + Constants.ON_START_KEY, "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                if (abstractC1947a != null) {
                    ((UpdatePackage) interfaceC1882b.mo5837b(C1943f.class)).getChannel();
                }
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onException", th.toString());
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onEnd", "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5841b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5841b(interfaceC1882b, abstractC1886d, th);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onChainException", th.toString());
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: c */
            public final <T> void mo5842c(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5842c(interfaceC1882b, abstractC1886d);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onPipelineEnd", "");
                } catch (Throwable unused) {
                }
            }
        }).m5867b());
        AbstractC1894l.b bVar = new AbstractC1894l.b();
        AbstractC1894l.a aVarM5880a = bVar.m5880a("branch_zip");
        AbstractC1894l.b bVar2 = new AbstractC1894l.b();
        AbstractC1894l.a aVarM5880a2 = bVar2.m5880a("patch");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(C1890h.a.m5860a().m5865a(C1945h.class).m5867b());
        arrayList2.add(C1890h.a.m5860a().m5865a(C1936c.class).m5866a(c1910b, file).m5864a(new C1884b(m6035b(abstractC1947a, c1910b), c1896a.m5883a(C1936c.class))).m5867b());
        arrayList2.add(C1890h.a.m5860a().m5865a(C1935b.class).m5864a(new C1884b(m6033a(abstractC1947a, c1910b), c1896a.m5883a(C1935b.class))).m5867b());
        arrayList2.add(C1890h.a.m5860a().m5865a(C1937d.class).m5866a(c1910b).m5864a(new C1884b(m6033a(abstractC1947a, c1910b), c1896a.m5883a(C1937d.class))).m5867b());
        arrayList2.add(C1890h.a.m5860a().m5865a(C1934a.class).m5864a(new C1884b(m6033a(abstractC1947a, c1910b), c1896a.m5883a(C1934a.class))).m5867b());
        arrayList2.add(C1890h.a.m5860a().m5865a(C1939f.class).m5864a(new C1884b(m6033a(abstractC1947a, c1910b), c1896a.m5883a(C1939f.class))).m5867b());
        arrayList2.add(C1890h.a.m5860a().m5865a(C1938e.class).m5864a(new C1884b(m6032a(abstractC1947a))).m5867b());
        aVarM5880a2.m5878a(arrayList2);
        AbstractC1894l.a aVarM5880a3 = bVar2.m5880a(MessengerShareContentUtility.WEBVIEW_RATIO_FULL);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C1890h.a.m5860a().m5865a(C1944g.class).m5867b());
        arrayList3.add(C1890h.a.m5860a().m5865a(C1931b.class).m5866a(c1910b, file).m5864a(new C1884b(m6035b(abstractC1947a, c1910b), c1896a.m5883a(C1931b.class))).m5867b());
        arrayList3.add(C1890h.a.m5860a().m5865a(C1930a.class).m5864a(new C1884b(m6033a(abstractC1947a, c1910b), c1896a.m5883a(C1930a.class))).m5867b());
        arrayList3.add(C1890h.a.m5860a().m5865a(C1933d.class).m5864a(new C1884b(m6033a(abstractC1947a, c1910b), c1896a.m5883a(C1933d.class))).m5867b());
        arrayList3.add(C1890h.a.m5860a().m5865a(C1932c.class).m5864a(new C1884b(m6032a(abstractC1947a))).m5867b());
        aVarM5880a3.m5878a(arrayList3);
        aVarM5880a.m5877a(bVar2.m5879a(C1929b.class)).m5877a(C1890h.a.m5860a().m5865a(C1888f.class).m5864a(m6031a(c1910b)).m5867b());
        AbstractC1894l.a aVarM5880a4 = bVar.m5880a("branch_single_file");
        AbstractC1894l.b bVar3 = new AbstractC1894l.b();
        AbstractC1894l.a aVarM5880a5 = bVar3.m5880a("patch");
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(C1890h.a.m5860a().m5865a(C1945h.class).m5867b());
        arrayList4.add(C1890h.a.m5860a().m5865a(C1926c.class).m5866a(c1910b, file).m5864a(new C1884b(m6035b(abstractC1947a, c1910b), c1896a.m5883a(C1926c.class))).m5867b());
        arrayList4.add(C1890h.a.m5860a().m5865a(C1925b.class).m5864a(new C1884b(m6033a(abstractC1947a, c1910b), c1896a.m5883a(C1925b.class))).m5867b());
        arrayList4.add(C1890h.a.m5860a().m5865a(C1927d.class).m5866a(c1910b).m5864a(new C1884b(m6033a(abstractC1947a, c1910b), c1896a.m5883a(C1927d.class))).m5867b());
        arrayList4.add(C1890h.a.m5860a().m5865a(C1924a.class).m5864a(new C1884b(m6033a(abstractC1947a, c1910b), c1896a.m5883a(C1924a.class))).m5867b());
        arrayList4.add(C1890h.a.m5860a().m5865a(C1928e.class).m5864a(new C1884b(m6032a(abstractC1947a), c1896a.m5883a(C1928e.class))).m5867b());
        aVarM5880a5.m5878a(arrayList4);
        AbstractC1894l.a aVarM5880a6 = bVar3.m5880a(MessengerShareContentUtility.WEBVIEW_RATIO_FULL);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(C1890h.a.m5860a().m5865a(C1944g.class).m5867b());
        arrayList5.add(C1890h.a.m5860a().m5865a(C1922b.class).m5866a(c1910b, file).m5864a(new C1884b(m6035b(abstractC1947a, c1910b), c1896a.m5883a(C1922b.class))).m5867b());
        arrayList5.add(C1890h.a.m5860a().m5865a(C1921a.class).m5864a(new C1884b(m6033a(abstractC1947a, c1910b), c1896a.m5883a(C1921a.class))).m5867b());
        arrayList5.add(C1890h.a.m5860a().m5865a(C1923c.class).m5864a(new C1884b(m6032a(abstractC1947a), c1896a.m5883a(C1923c.class))).m5867b());
        aVarM5880a6.m5878a(arrayList5);
        aVarM5880a4.m5877a(bVar3.m5879a(C1929b.class)).m5877a(C1890h.a.m5860a().m5865a(C1888f.class).m5864a(m6031a(c1910b)).m5867b());
        AbstractC1894l.a aVarM5880a7 = bVar.m5880a("branch_myarchive_file");
        AbstractC1894l.b bVar4 = new AbstractC1894l.b();
        bVar4.m5880a("patch").m5878a(Collections.EMPTY_LIST);
        bVar4.m5880a(MessengerShareContentUtility.WEBVIEW_RATIO_FULL).m5878a(Collections.EMPTY_LIST);
        aVarM5880a7.m5877a(bVar4.m5879a(C1929b.class)).m5877a(C1890h.a.m5860a().m5865a(C1888f.class).m5864a(m6031a(c1910b)).m5867b());
        arrayList.add(bVar.m5879a(C1920a.class));
        arrayList.add(C1890h.a.m5860a().m5865a(C1946i.class).m5864a(new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.g.a.2
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5838a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5838a(interfaceC1882b, abstractC1886d);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + Constants.ON_START_KEY, "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onException", th.toString());
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onEnd", "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5841b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5841b(interfaceC1882b, abstractC1886d, th);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onChainException", th.toString());
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: c */
            public final <T> void mo5842c(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5842c(interfaceC1882b, abstractC1886d);
                Pair pair = (Pair) interfaceC1882b.mo5835a(C1946i.class);
                if (abstractC1947a != null) {
                    Object obj = pair.first;
                    ((Long) pair.second).longValue();
                }
            }
        }).m5867b());
        return C1885c.m5845a(arrayList, null);
    }

    /* JADX INFO: renamed from: b */
    private static AbstractC1883a m6035b(final AbstractC1947a abstractC1947a, final C1910b c1910b) {
        return new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.g.a.5
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5838a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5838a(interfaceC1882b, abstractC1886d);
                if (abstractC1947a != null) {
                    interfaceC1882b.mo5835a(C1929b.class);
                }
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + Constants.ON_START_KEY, "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                if (abstractC1947a != null) {
                    interfaceC1882b.mo5835a(C1929b.class);
                }
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onException", th.toString());
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                if (abstractC1947a != null) {
                    interfaceC1882b.mo5837b(C1929b.class);
                }
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onEnd", "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5841b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5841b(interfaceC1882b, abstractC1886d, th);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onChainException", th.toString());
                } catch (Throwable unused) {
                }
            }
        };
    }
}
