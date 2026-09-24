package com.ironsource.adqualitysdk.sdk.p286i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jg */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12058jg {

    /* JADX INFO: renamed from: ﻐ */
    private static AbstractC12058jg f29621;

    /* JADX INFO: renamed from: ﾒ */
    boolean f29623 = false;

    /* JADX INFO: renamed from: ﾇ */
    private Set<InterfaceC12061jj> f29622 = new HashSet();

    /* JADX INFO: renamed from: ﻐ */
    public abstract Activity mo30664();

    /* JADX INFO: renamed from: ｋ */
    public abstract void mo30667(Application application, Activity activity);

    /* JADX INFO: renamed from: ﾒ */
    public abstract boolean mo30669();

    /* JADX INFO: renamed from: ｋ */
    public static synchronized AbstractC12058jg m30663() {
        if (f29621 == null) {
            f29621 = new c((byte) 0);
        }
        return f29621;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final synchronized void m30665(InterfaceC12061jj interfaceC12061jj) {
        this.f29622.add(interfaceC12061jj);
    }

    /* JADX INFO: renamed from: ﻛ */
    public final synchronized void m30666(InterfaceC12061jj interfaceC12061jj) {
        this.f29622.remove(interfaceC12061jj);
    }

    /* JADX INFO: renamed from: ﾇ */
    protected final synchronized List<InterfaceC12061jj> m30668() {
        return new ArrayList(this.f29622);
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jg$a */
    static class a extends AbstractC12058jg {

        /* JADX INFO: renamed from: ﻐ */
        private static int f29624 = 0;

        /* JADX INFO: renamed from: ﻛ */
        private static int f29625 = 1;

        /* JADX INFO: renamed from: ｋ */
        private static int f29626 = 184;

        /* JADX INFO: renamed from: ﾇ */
        private Context f29627;

        /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001a A[Catch: all -> 0x0052, TryCatch #1 {, blocks: (B:4:0x0002, B:26:0x003b, B:27:0x0041, B:34:0x0051, B:13:0x001a, B:15:0x0023, B:21:0x0030, B:22:0x0031, B:11:0x0017, B:32:0x004f, B:7:0x0011, B:17:0x002b), top: B:40:0x0002, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:15:0x0023 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0002, B:26:0x003b, B:27:0x0041, B:34:0x0051, B:13:0x001a, B:15:0x0023, B:21:0x0030, B:22:0x0031, B:11:0x0017, B:32:0x004f, B:7:0x0011, B:17:0x002b), top: B:40:0x0002, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x0031 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0002, B:26:0x003b, B:27:0x0041, B:34:0x0051, B:13:0x001a, B:15:0x0023, B:21:0x0030, B:22:0x0031, B:11:0x0017, B:32:0x004f, B:7:0x0011, B:17:0x002b), top: B:40:0x0002, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:25:0x0039 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:26:0x003b A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0002, B:26:0x003b, B:27:0x0041, B:34:0x0051, B:13:0x001a, B:15:0x0023, B:21:0x0030, B:22:0x0031, B:11:0x0017, B:32:0x004f, B:7:0x0011, B:17:0x002b), top: B:40:0x0002, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:29:0x004c A[DONT_GENERATE] */
        /* JADX WARN: Code duplicated, block: B:31:0x004e  */
        /* JADX WARN: Instruction removed from duplicated block: B:29:0x004c, please report this as an issue */
        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12058jg
        /* JADX INFO: renamed from: ｋ */
        public final synchronized void mo30667(Application application, Activity activity) {
            int i;
            int i2;
            int i3 = 2 % 2;
            int i4 = f29625 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            int i5 = i4 % 128;
            f29624 = i5;
            if (i4 % 2 == 0) {
                if (application == null) {
                    if (activity != null) {
                        this.f29627 = activity.getApplicationContext();
                    }
                    i2 = f29625 + 115;
                    f29624 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return;
                    } else {
                        throw null;
                    }
                }
                i = i5 + 85;
                f29625 = i % 128;
                if (i % 2 == 0) {
                    this.f29627 = application.getApplicationContext();
                    return;
                } else {
                    this.f29627 = application.getApplicationContext();
                    int i6 = 30 / 0;
                    return;
                }
            }
            int i7 = 45 / 0;
            if (application == null) {
                if (activity != null) {
                    this.f29627 = activity.getApplicationContext();
                }
                i2 = f29625 + 115;
                f29624 = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                } else {
                    throw null;
                }
            }
            i = i5 + 85;
            f29625 = i % 128;
            if (i % 2 == 0) {
                this.f29627 = application.getApplicationContext();
                return;
            } else {
                this.f29627 = application.getApplicationContext();
                int i8 = 30 / 0;
                return;
            }
            throw th;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12058jg
        /* JADX INFO: renamed from: ﻐ */
        public final Activity mo30664() {
            int i = 2 % 2;
            int i2 = f29625;
            int i3 = i2 + 9;
            f29624 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 95;
            f29624 = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12058jg
        /* JADX INFO: renamed from: ﾒ */
        public final boolean mo30669() {
            int i = 2 % 2;
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f29627.getSystemService(m30670("\t￼\u0007\ufff6\ufff4\f\u0007￼", 8 - View.MeasureSpec.getSize(0), true, TextUtils.getCapsMode("", 0, 0) + 5, 293 - Color.red(0)).intern())).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                String packageName = this.f29627.getPackageName();
                int i2 = f29624 + 105;
                f29625 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 3;
                }
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                        int i4 = f29624 + 1;
                        f29625 = i4 % 128;
                        int i5 = i4 % 2;
                        return true;
                    }
                    int i6 = f29624 + 59;
                    f29625 = i6 % 128;
                    int i7 = i6 % 2;
                }
                return false;
            }
            int i8 = f29624 + 49;
            f29625 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        /* JADX INFO: renamed from: ﾇ */
        private static String m30670(String str, int i, boolean z, int i2, int i3) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C11889d.f28479) {
                char[] cArr2 = new char[i];
                C11889d.f28481 = 0;
                while (C11889d.f28481 < i) {
                    C11889d.f28480 = cArr[C11889d.f28481];
                    cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i3);
                    int i4 = C11889d.f28481;
                    cArr2[i4] = (char) (cArr2[i4] - f29626);
                    C11889d.f28481++;
                }
                if (i2 > 0) {
                    C11889d.f28478 = i2;
                    char[] cArr3 = new char[i];
                    System.arraycopy(cArr2, 0, cArr3, 0, i);
                    System.arraycopy(cArr3, 0, cArr2, i - C11889d.f28478, C11889d.f28478);
                    System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i - C11889d.f28478);
                }
                if (z) {
                    char[] cArr4 = new char[i];
                    C11889d.f28481 = 0;
                    while (C11889d.f28481 < i) {
                        cArr4[C11889d.f28481] = cArr2[(i - C11889d.f28481) - 1];
                        C11889d.f28481++;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jg$c */
    static class c extends AbstractC12058jg implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: ﺙ */
        private static int f29628 = 0;

        /* JADX INFO: renamed from: ﻏ */
        private static int f29629 = 1;

        /* JADX INFO: renamed from: ﻐ */
        private static long f29630 = -5047899076717812475L;

        /* JADX INFO: renamed from: ﻛ */
        private WeakReference<Application> f29631;

        /* JADX INFO: renamed from: ｋ */
        private Map<Activity, Boolean> f29632;

        /* JADX INFO: renamed from: ﾇ */
        private WeakReference<Activity> f29633;

        private c() {
            this.f29632 = new WeakHashMap();
        }

        /* synthetic */ c(byte b) {
            this();
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12058jg
        /* JADX INFO: renamed from: ｋ */
        public final synchronized void mo30667(Application application, Activity activity) {
            if (this.f29631 == null) {
                this.f29631 = new WeakReference<>(application);
                if (activity != null) {
                    m30674(activity);
                    synchronized (this) {
                        this.f29632.put(activity, Boolean.TRUE);
                    }
                }
                application.registerActivityLifecycleCallbacks(this);
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12058jg
        /* JADX INFO: renamed from: ﻐ */
        public final Activity mo30664() {
            int i = 2 % 2;
            int i2 = f29629;
            int i3 = i2 + 81;
            int i4 = i3 % 128;
            f29628 = i4;
            int i5 = i3 % 2;
            WeakReference<Activity> weakReference = this.f29633;
            if (weakReference == null) {
                int i6 = i4 + 19;
                f29629 = i6 % 128;
                if (i6 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            int i7 = i2 + 3;
            f29628 = i7 % 128;
            int i8 = i7 % 2;
            Activity activity = weakReference.get();
            int i9 = f29628 + 83;
            f29629 = i9 % 128;
            if (i9 % 2 != 0) {
                return activity;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ */
        private void m30674(final Activity activity) {
            int i = 2 % 2;
            this.f29633 = new WeakReference<>(activity);
            C12089p.m30933(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.c.4
                @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
                /* JADX INFO: renamed from: ﻛ */
                public final void mo28224() throws Exception {
                    C12074jw.m30774(activity);
                }
            });
            int i2 = f29628 + 89;
            f29629 = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC12058jg
        /* JADX INFO: renamed from: ﾒ */
        public final synchronized boolean mo30669() {
            int i = 2 % 2;
            if (this.f29632.size() > 0) {
                int i2 = f29629 + 101;
                f29628 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = f29628 + 95;
            f29629 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            int i = 2 % 2;
            int i2 = f29628 + 33;
            f29629 = i2 % 128;
            Object obj = null;
            try {
                if (i2 % 2 == 0) {
                    m30674(activity);
                    m30668().iterator();
                    super.hashCode();
                    throw null;
                }
                m30674(activity);
                Iterator<InterfaceC12061jj> it = m30668().iterator();
                while (it.hasNext()) {
                    int i3 = f29629 + 67;
                    f29628 = i3 % 128;
                    if (i3 % 2 != 0) {
                        it.next().onActivityResumed(activity);
                        throw null;
                    }
                    it.next().onActivityResumed(activity);
                }
            } catch (Exception e) {
                C12080kb.m30845(m30672("\u202a\u206d\ud9c9베ੵꊊ둟₼쀐鹂跧亭ࡤ咁㉁\udaa9鱵\uf8e4䘳曠瀓泯\uda3e\uf2dd쐠郅渌黇堷ӆ苤⨉ⳅ\ua83d", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), m30672("䩢䨧Ă摵㈰\ufaf3\ude04\uf83b\uf848\ua63f햓ᛞ扪豀ਔ若\uf63d‷繧㺮ᩛ됣\ue26bꪞ깣䠘噓욍㉿\udc1b", Drawable.resolveOpacity(0, 0) + 1).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            int i = 2 % 2;
            int i2 = f29628 + 101;
            f29629 = i2 % 128;
            int i3 = i2 % 2;
            try {
                Iterator<InterfaceC12061jj> it = m30668().iterator();
                while (it.hasNext()) {
                    int i4 = f29629 + 115;
                    f29628 = i4 % 128;
                    int i5 = i4 % 2;
                    it.next().onActivityPaused(activity);
                }
            } catch (Exception e) {
                C12080kb.m30845(m30672("\u202a\u206d\ud9c9베ੵꊊ둟₼쀐鹂跧亭ࡤ咁㉁\udaa9鱵\uf8e4䘳曠瀓泯\uda3e\uf2dd쐠郅渌黇堷ӆ苤⨉ⳅ\ua83d", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1).intern(), m30672("㥪㤯ꨖ콡咾\ue664괌匯黆삱줄\u0a49ᅢ❔沚鹲蔵謣ᣩ∹楓ἷ蓥똋\udd6f\ue30aホ\uda12䅶", 1 - Gravity.getAbsoluteGravity(0, 0)).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                synchronized (AbstractC12058jg.class) {
                    if (this.f29633 == null) {
                        m30674(activity);
                        AbstractC12058jg.class.notifyAll();
                    }
                }
                Iterator<InterfaceC12061jj> it = m30668().iterator();
                while (it.hasNext()) {
                    it.next().onActivityCreated(activity, bundle);
                }
            } catch (Exception e) {
                C12080kb.m30845(m30672("\u202a\u206d\ud9c9베ੵꊊ둟₼쀐鹂跧亭ࡤ咁㉁\udaa9鱵\uf8e4䘳曠瀓泯\uda3e\uf2dd쐠郅渌黇堷ӆ苤⨉ⳅ\ua83d", 1 - TextUtils.getOffsetAfter("", 0)).intern(), m30672("䮒䯗数\u0007䬺\udfe5\udff4鱉腂\udf35\uf085㏈掚\ue832猞ꟳ\uf7cd䑅ݭ᮸᮫큑魡辙꾄ⱼ⽍\ue382㎏롩", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            try {
                if (this.f29633 == null) {
                    m30674(activity);
                }
                synchronized (this) {
                    this.f29632.put(activity, Boolean.TRUE);
                }
                Iterator<InterfaceC12061jj> it = m30668().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStarted(activity);
                }
                if (activity.getLocalClassName().equals(m30672("\ud96f\ud90c滣உ닽氏䴎鞔碚⛭䌮聹\uf13e\ue3fd諌ᐷ攣俎ﺽꠜ襚\udbc4拮㰤㵥⟣횀値ꅇ돲㩹\ue4d0햆ἀ깜磇禠款\u1249賀\uedb8\uf72e虍ₛᇎ䍚\uea31", -TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    return;
                }
                synchronized (this) {
                    if (this.f29632.size() == 1 && !this.f29623) {
                        m30671(activity);
                    }
                }
            } catch (Exception e) {
                C12080kb.m30845(m30672("\u202a\u206d\ud9c9베ੵꊊ둟₼쀐鹂跧亭ࡤ咁㉁\udaa9鱵\uf8e4䘳曠瀓泯\uda3e\uf2dd쐠郅渌黇堷ӆ苤⨉ⳅ\ua83d", -TextUtils.indexOf((CharSequence) "", '0')).intern(), m30672("㱳㰶壉㶾\udeaa뀤ꠕꇰᓒ䪥齄尉ᑻ햋\ue68e젲耬秼鋽瑹汊\uede8\u0ef1\ue048\ud863ᇁ뫎豃䑮藐", 1 - Color.blue(0)).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            int size;
            try {
                Iterator<InterfaceC12061jj> it = m30668().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStopped(activity);
                }
                this.f29623 = activity.isChangingConfigurations();
                synchronized (this) {
                    if (!this.f29632.containsKey(activity) || activity.getLocalClassName().equals(m30672("\ud96f\ud90c滣உ닽氏䴎鞔碚⛭䌮聹\uf13e\ue3fd諌ᐷ攣俎ﺽꠜ襚\udbc4拮㰤㵥⟣횀値ꅇ돲㩹\ue4d0햆ἀ깜磇禠款\u1249賀\uedb8\uf72e虍ₛᇎ䍚\uea31", 1 - KeyEvent.getDeadChar(0, 0)).intern())) {
                        size = -1;
                    } else {
                        this.f29632.remove(activity);
                        size = this.f29632.size();
                    }
                }
                if (size < 0 || size != 0 || this.f29623) {
                    return;
                }
                m30673(activity);
            } catch (Exception e) {
                C12080kb.m30845(m30672("\u202a\u206d\ud9c9베ੵꊊ둟₼쀐鹂跧亭ࡤ咁㉁\udaa9鱵\uf8e4䘳曠瀓泯\uda3e\uf2dd쐠郅渌黇堷ӆ苤⨉ⳅ\ua83d", ExpandableListView.getPackedPositionType(0L) + 1).intern(), m30672("茸荽葄\ue133㗯僭\u175e絽ﾗꇠ羍변ꬰआ\u0dcb⣻㽧ꕱ禸钰팁ㅥ\ue5b4\u0081木쵂冉沎ﬥ奝", 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            int i = 2 % 2;
            try {
                Iterator<InterfaceC12061jj> it = m30668().iterator();
                while (it.hasNext()) {
                    int i2 = f29629 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                    f29628 = i2 % 128;
                    if (i2 % 2 != 0) {
                        it.next().onActivitySaveInstanceState(activity, bundle);
                        int i3 = 18 / 0;
                    } else {
                        it.next().onActivitySaveInstanceState(activity, bundle);
                    }
                    int i4 = f29628 + 67;
                    f29629 = i4 % 128;
                    int i5 = i4 % 2;
                }
            } catch (Exception e) {
                C12080kb.m30845(m30672("\u202a\u206d\ud9c9베ੵꊊ둟₼쀐鹂跧亭ࡤ咁㉁\udaa9鱵\uf8e4䘳曠瀓泯\uda3e\uf2dd쐠郅渌黇堷ӆ苤⨉ⳅ\ua83d", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), m30672("䭧䬢푒넥햿蕱\udf01\u2d6bῇ䆰ꨑ楜捯夐\ued9bﵧ\uf738\uf567駨䄬᭞慳פ픝꽢鵍뇌뤫㍱ड़崱\u0df7䞅ꖠ줴釙\uebb3톖甙旛", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            int i = 2 % 2;
            int i2 = f29629 + 79;
            f29628 = i2 % 128;
            int i3 = i2 % 2;
            try {
                Iterator<InterfaceC12061jj> it = m30668().iterator();
                while (it.hasNext()) {
                    int i4 = f29628 + 113;
                    f29629 = i4 % 128;
                    int i5 = i4 % 2;
                    it.next().onActivityDestroyed(activity);
                }
                int i6 = f29629 + 25;
                f29628 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Exception e) {
                C12080kb.m30845(m30672("\u202a\u206d\ud9c9베ੵꊊ둟₼쀐鹂跧亭ࡤ咁㉁\udaa9鱵\uf8e4䘳曠瀓泯\uda3e\uf2dd쐠郅渌黇堷ӆ苤⨉ⳅ\ua83d", 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), m30672("\udf20\udf65毩ພኵ麑䭆鋐\ud8cd蚺뇱犼\uf728\ue6ab⪑\ue687捿䫜廢嫌輙\udec8싮컪㬡⋳盗ꋰꜷ뛭騪ᘒ", -TextUtils.lastIndexOf("", '0', 0, 0)).intern(), (Throwable) e, false);
            }
        }

        /* JADX INFO: renamed from: ｋ */
        private void m30673(Activity activity) {
            int i = 2 % 2;
            int i2 = f29628 + 37;
            f29629 = i2 % 128;
            int i3 = i2 % 2;
            Iterator<InterfaceC12061jj> it = m30668().iterator();
            int i4 = f29628 + 23;
            f29629 = i4 % 128;
            while (true) {
                int i5 = i4 % 2;
                if (!it.hasNext()) {
                    return;
                }
                int i6 = f29628 + 43;
                f29629 = i6 % 128;
                if (i6 % 2 == 0) {
                    it.next().mo28395(activity);
                    Object obj = null;
                    super.hashCode();
                    throw null;
                }
                it.next().mo28395(activity);
                i4 = f29629 + 79;
                f29628 = i4 % 128;
            }
        }

        /* JADX INFO: renamed from: ﻛ */
        private void m30671(Activity activity) {
            int i = 2 % 2;
            int i2 = f29628 + 75;
            f29629 = i2 % 128;
            int i3 = i2 % 2;
            Iterator<InterfaceC12061jj> it = m30668().iterator();
            int i4 = f29629 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f29628 = i4 % 128;
            int i5 = i4 % 2;
            while (it.hasNext()) {
                int i6 = f29628 + 83;
                f29629 = i6 % 128;
                if (i6 % 2 == 0) {
                    it.next().mo28396(activity);
                    int i7 = 30 / 0;
                } else {
                    it.next().mo28396(activity);
                }
            }
            int i8 = f29629 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f29628 = i8 % 128;
            if (i8 % 2 == 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: ｋ */
        private static String m30672(String str, int i) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (C11943f.f28848) {
                char[] cArrM30189 = C11943f.m30189(f29630, cArr, i);
                C11943f.f28846 = 4;
                while (C11943f.f28846 < cArrM30189.length) {
                    C11943f.f28847 = C11943f.f28846 - 4;
                    cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f29630));
                    C11943f.f28846++;
                }
                str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
            }
            return str2;
        }
    }
}
