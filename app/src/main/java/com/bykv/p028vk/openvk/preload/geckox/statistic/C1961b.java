package com.bykv.p028vk.openvk.preload.geckox.statistic;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.p028vk.openvk.preload.geckox.C1900a;
import com.bykv.p028vk.openvk.preload.geckox.C1910b;
import com.bykv.p028vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p028vk.openvk.preload.geckox.p037c.C1941d;
import com.bykv.p028vk.openvk.preload.geckox.p037c.C1942e;
import com.bykv.p028vk.openvk.preload.geckox.p037c.C1944g;
import com.bykv.p028vk.openvk.preload.geckox.p037c.C1945h;
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
import com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p042a.C1933d;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p043b.C1934a;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p043b.C1935b;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p043b.C1936c;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p043b.C1937d;
import com.bykv.p028vk.openvk.preload.geckox.p037c.p041b.p043b.C1939f;
import com.bykv.p028vk.openvk.preload.geckox.statistic.model.C1963a;
import com.bykv.p028vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1968e;
import com.bykv.p028vk.openvk.preload.p029a.AbstractC1886d;
import com.bykv.p028vk.openvk.preload.p029a.InterfaceC1882b;
import com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a;
import com.hbisoft.hbrecorder.Constants;
import java.util.Map;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.statistic.b */
/* JADX INFO: compiled from: UpdateListeners.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1961b {
    /* JADX INFO: renamed from: a */
    private static AbstractC1883a m6050a(final Context context) {
        return new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.4
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5838a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5838a(interfaceC1882b, abstractC1886d);
                Pair pair = (Pair) interfaceC1882b.mo5837b(C1944g.class);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) pair.second).getChannel());
                c1963aM6048a.f4476t = ((Uri) pair.first).toString();
                c1963aM6048a.f4470n = C1968e.m6082a(context);
                c1963aM6048a.f4478v = SystemClock.uptimeMillis();
                c1963aM6048a.f4472p = Long.valueOf(((UpdatePackage) pair.second).getFullPackage().getId());
                c1963aM6048a.f4459c = ((UpdatePackage) pair.second).getChannel();
                if (!TextUtils.isEmpty(((UpdatePackage) pair.second).getAccessKey())) {
                    c1963aM6048a.f4457a = ((UpdatePackage) pair.second).getAccessKey();
                }
                if (TextUtils.isEmpty(((UpdatePackage) pair.second).getGroupName())) {
                    return;
                }
                c1963aM6048a.f4458b = ((UpdatePackage) pair.second).getGroupName();
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                Pair pair = (Pair) interfaceC1882b.mo5837b(C1944g.class);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) pair.second).getChannel());
                String string = ((Uri) pair.first).toString();
                c1963aM6048a.f4482z = false;
                c1963aM6048a.f4479w = SystemClock.uptimeMillis();
                c1963aM6048a.f4477u.add(new StatisticModel.PackageStatisticModel.DownloadFailRecords(string, th.getMessage()));
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1944g.class)).second).getChannel());
                c1963aM6048a.f4482z = true;
                c1963aM6048a.f4479w = SystemClock.uptimeMillis();
            }
        };
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC1883a m6051a(final C1910b c1910b) {
        return new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.1
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
                    C1962c.m6056a(c1910b, C1960a.m6047a(abstractC1886d.m5849b()));
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onEnd", "");
                    if ((abstractC1886d instanceof C1942e) && (abstractC1886d.m5856f() instanceof Map)) {
                        c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName(), ((Map) abstractC1886d.m5856f()).get("f36c832c8dbb162c49b46a7a6dd47fbd"));
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5841b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5841b(interfaceC1882b, abstractC1886d, th);
                try {
                    c1910b.m5928f().put(abstractC1886d.getClass().getSimpleName() + "onChainException", th.toString());
                    C1962c.m6056a(c1910b, C1960a.m6047a(abstractC1886d.m5849b()));
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: c */
            public final <T> void mo5842c(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5842c(interfaceC1882b, abstractC1886d);
                try {
                    C1962c.m6056a(c1910b, C1960a.m6047a(abstractC1886d.m5849b()));
                } catch (Throwable unused) {
                }
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m6052a(C1900a c1900a, C1910b c1910b) {
        c1900a.m5894a(C1942e.class, m6051a(c1910b));
        c1900a.m5894a(C1941d.class, m6051a(c1910b));
        c1900a.m5894a(C1926c.class, m6053b(c1910b.m5922a()));
        c1900a.m5894a(C1925b.class, new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel());
                c1963aM6048a.f4465i = false;
                SystemClock.uptimeMillis();
                c1963aM6048a.f4473q = th.getMessage();
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel()).f4465i = true;
            }
        });
        c1900a.m5894a(C1927d.class, new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel());
                c1963aM6048a.f4466j = false;
                SystemClock.uptimeMillis();
                c1963aM6048a.f4474r = th.getMessage();
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel()).f4466j = true;
                SystemClock.uptimeMillis();
            }
        });
        c1900a.m5894a(C1924a.class, new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel());
                c1963aM6048a.f4466j = false;
                c1963aM6048a.f4468l = SystemClock.uptimeMillis();
                c1963aM6048a.f4474r = th.getMessage();
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel());
                c1963aM6048a.f4466j = true;
                c1963aM6048a.f4468l = SystemClock.uptimeMillis();
            }
        });
        c1900a.m5894a(C1928e.class, new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.11
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel());
                c1963aM6048a.f4467k = false;
                c1963aM6048a.f4475s = th.getMessage();
                c1963aM6048a.f4469m = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel());
                c1963aM6048a.f4467k = true;
                c1963aM6048a.f4469m = SystemClock.uptimeMillis();
            }
        });
        c1900a.m5894a(C1922b.class, m6050a(c1910b.m5922a()));
        c1900a.m5894a(C1921a.class, new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1944g.class)).second).getChannel());
                c1963aM6048a.f4453A = false;
                c1963aM6048a.f4480x = SystemClock.uptimeMillis();
                c1963aM6048a.f4455C = th.getMessage();
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1944g.class)).second).getChannel());
                c1963aM6048a.f4453A = true;
                c1963aM6048a.f4480x = SystemClock.uptimeMillis();
            }
        });
        c1900a.m5894a(C1923c.class, new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.10
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1944g.class)).second).getChannel());
                c1963aM6048a.f4454B = false;
                c1963aM6048a.f4481y = SystemClock.uptimeMillis();
                c1963aM6048a.f4456D = th.getMessage();
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1944g.class)).second).getChannel());
                c1963aM6048a.f4454B = true;
                c1963aM6048a.f4481y = SystemClock.uptimeMillis();
            }
        });
        c1900a.m5894a(C1936c.class, m6053b(c1910b.m5922a()));
        c1900a.m5894a(C1935b.class, new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel());
                c1963aM6048a.f4465i = false;
                SystemClock.uptimeMillis();
                c1963aM6048a.f4473q = th.getMessage();
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel()).f4465i = true;
            }
        });
        c1900a.m5894a(C1937d.class, new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel());
                c1963aM6048a.f4466j = false;
                SystemClock.uptimeMillis();
                c1963aM6048a.f4474r = th.getMessage();
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel()).f4466j = true;
                SystemClock.uptimeMillis();
            }
        });
        c1900a.m5894a(C1934a.class, new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel());
                c1963aM6048a.f4466j = false;
                c1963aM6048a.f4468l = SystemClock.uptimeMillis();
                c1963aM6048a.f4474r = th.getMessage();
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel());
                c1963aM6048a.f4466j = true;
                c1963aM6048a.f4468l = SystemClock.uptimeMillis();
            }
        });
        c1900a.m5894a(C1939f.class, new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.3
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel());
                c1963aM6048a.f4467k = false;
                c1963aM6048a.f4469m = SystemClock.uptimeMillis();
                c1963aM6048a.f4475s = th.getMessage();
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5841b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5841b(interfaceC1882b, abstractC1886d, th);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel());
                c1963aM6048a.f4467k = false;
                c1963aM6048a.f4469m = SystemClock.uptimeMillis();
                c1963aM6048a.f4456D = th.getMessage();
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: c */
            public final <T> void mo5842c(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5842c(interfaceC1882b, abstractC1886d);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel());
                c1963aM6048a.f4467k = true;
                c1963aM6048a.f4469m = SystemClock.uptimeMillis();
            }
        });
        c1900a.m5894a(C1931b.class, m6050a(c1910b.m5922a()));
        c1900a.m5894a(C1930a.class, new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1944g.class)).second).getChannel());
                c1963aM6048a.f4453A = false;
                c1963aM6048a.f4480x = SystemClock.uptimeMillis();
                c1963aM6048a.f4455C = th.getMessage();
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1944g.class)).second).getChannel());
                c1963aM6048a.f4453A = true;
                c1963aM6048a.f4480x = SystemClock.uptimeMillis();
            }
        });
        c1900a.m5894a(C1933d.class, new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.2
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1944g.class)).second).getChannel());
                c1963aM6048a.f4454B = false;
                c1963aM6048a.f4481y = SystemClock.uptimeMillis();
                c1963aM6048a.f4456D = th.getMessage();
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5841b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5841b(interfaceC1882b, abstractC1886d, th);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1944g.class)).second).getChannel());
                c1963aM6048a.f4454B = false;
                c1963aM6048a.f4481y = SystemClock.uptimeMillis();
                c1963aM6048a.f4456D = th.getMessage();
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: c */
            public final <T> void mo5842c(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5842c(interfaceC1882b, abstractC1886d);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1944g.class)).second).getChannel());
                c1963aM6048a.f4454B = true;
                c1963aM6048a.f4481y = SystemClock.uptimeMillis();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private static AbstractC1883a m6053b(final Context context) {
        return new AbstractC1883a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.5
            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5838a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5838a(interfaceC1882b, abstractC1886d);
                Pair pair = (Pair) interfaceC1882b.mo5837b(C1945h.class);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) pair.second).getChannel());
                c1963aM6048a.f4460d = ((Uri) pair.first).toString();
                c1963aM6048a.f4470n = C1968e.m6082a(context);
                c1963aM6048a.f4462f = SystemClock.uptimeMillis();
                c1963aM6048a.f4471o = Long.valueOf(((UpdatePackage) pair.second).getPatch().getId());
                c1963aM6048a.f4472p = Long.valueOf(((UpdatePackage) pair.second).getFullPackage().getId());
                c1963aM6048a.f4459c = ((UpdatePackage) pair.second).getChannel();
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: a */
            public final <T> void mo5839a(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d, Throwable th) {
                super.mo5839a(interfaceC1882b, abstractC1886d, th);
                Pair pair = (Pair) interfaceC1882b.mo5837b(C1945h.class);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) pair.second).getChannel());
                String string = ((Uri) pair.first).toString();
                c1963aM6048a.f4464h = false;
                c1963aM6048a.f4463g = SystemClock.uptimeMillis();
                c1963aM6048a.f4461e.add(new StatisticModel.PackageStatisticModel.DownloadFailRecords(string, th.getMessage()));
            }

            @Override // com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a
            /* JADX INFO: renamed from: b */
            public final <T> void mo5840b(InterfaceC1882b<T> interfaceC1882b, AbstractC1886d abstractC1886d) {
                super.mo5840b(interfaceC1882b, abstractC1886d);
                C1963a c1963aM6048a = C1960a.m6047a(abstractC1886d.m5849b()).m6048a(((UpdatePackage) ((Pair) interfaceC1882b.mo5837b(C1945h.class)).second).getChannel());
                c1963aM6048a.f4464h = true;
                c1963aM6048a.f4463g = SystemClock.uptimeMillis();
            }
        };
    }
}
