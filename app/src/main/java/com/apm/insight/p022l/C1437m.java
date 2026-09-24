package com.apm.insight.p022l;

import android.text.TextUtils;
import com.apm.insight.C1373a;
import com.apm.insight.nativecrash.NativeImpl;
import com.facebook.internal.security.CertificateUtil;
import com.google.common.base.Ascii;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.l.m */
/* JADX INFO: compiled from: Stack.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1437m {

    /* JADX INFO: renamed from: a */
    private static final StackTraceElement f742a = new StackTraceElement("", "", "", 0);

    /* JADX INFO: renamed from: com.apm.insight.l.m$a */
    /* JADX INFO: compiled from: Stack.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f743a;

        /* JADX INFO: renamed from: b */
        public int f744b;

        public a(int i, int i2) {
            this.f743a = i;
            this.f744b = i2;
        }

        /* JADX INFO: renamed from: a */
        public final JSONObject m1432a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("start", this.f743a);
                jSONObject.put("end", this.f744b);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1411a(String str) {
        BufferedReader bufferedReader = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            int i2 = 0;
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        break;
                    }
                    if (i2 <= 256) {
                        linkedList.add(line);
                        sb.append(line);
                        sb.append('\n');
                    } else {
                        linkedList2.add(line);
                        if (linkedList2.size() > 256) {
                            linkedList2.poll();
                            i++;
                        }
                    }
                    i2++;
                } catch (Throwable unused) {
                    bufferedReader = bufferedReader2;
                    C1373a.m860a((Closeable) bufferedReader);
                }
            }
            C1373a.m860a((Closeable) bufferedReader2);
        } catch (Throwable unused2) {
        }
        if (!linkedList2.isEmpty()) {
            if (i != 0) {
                sb.append("\t... skip ");
                sb.append(i);
                sb.append(" lines\n");
            }
            Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m1412a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            m1421a(th, printWriter);
            String string = stringWriter.toString();
            printWriter.close();
            return string;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1413a(Throwable th, PrintStream printStream, C1429e.a aVar) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        } catch (Throwable unused) {
            messageDigest = null;
        }
        C1429e c1429e = new C1429e(printStream, messageDigest, aVar);
        try {
            m1421a(th, c1429e);
        } catch (Throwable unused2) {
        }
        c1429e.close();
        if (messageDigest == null) {
            return null;
        }
        byte[] bArrDigest = messageDigest.digest();
        if (bArrDigest == null || bArrDigest.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArrDigest.length << 1];
        int i = 0;
        for (byte b : bArrDigest) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i += 2;
            cArr2[i2] = cArr[b & Ascii.f22499SI];
        }
        return new String(cArr2);
    }

    /* JADX INFO: renamed from: a */
    public static String m1414a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            m1415a(stackTraceElement, sb);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static StringBuilder m1415a(StackTraceElement stackTraceElement, StringBuilder sb) {
        String className = stackTraceElement.getClassName();
        sb.append("  at ");
        sb.append(className);
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        sb.append("(");
        sb.append(stackTraceElement.getFileName());
        sb.append(CertificateUtil.DELIMITER);
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")\n");
        return sb;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m1416a(StackTraceElement[] stackTraceElementArr, String[] strArr) {
        a aVar = new a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < stackTraceElementArr.length; i++) {
            if (aVar.f743a == -1) {
                if (m1425a(stackTraceElementArr[i].getClassName(), strArr)) {
                    aVar.f743a = i;
                    aVar.f744b = i;
                }
            } else if (!m1425a(stackTraceElementArr[i].getClassName(), strArr)) {
                aVar.f744b = i;
                jSONArray.put(aVar.m1432a());
                aVar = new a(-1, -1);
            }
        }
        if (aVar.f743a != -1) {
            aVar.f744b = stackTraceElementArr.length;
            jSONArray.put(aVar.m1432a());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m1417a(String[] strArr, String[] strArr2) {
        a aVar = new a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < strArr.length; i++) {
            if (aVar.f743a == -1) {
                if (m1425a(strArr[i], strArr2)) {
                    aVar.f743a = i;
                    aVar.f744b = i;
                }
            } else if (!m1425a(strArr[i], strArr2)) {
                aVar.f744b = i;
                jSONArray.put(aVar.m1432a());
                aVar = new a(-1, -1);
            }
        }
        if (aVar.f743a != -1) {
            aVar.f744b = strArr.length;
            jSONArray.put(aVar.m1432a());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    private static void m1418a(StackTraceElement stackTraceElement, int i) {
        try {
            NativeImpl.m1449a(i, "\tat ");
            NativeImpl.m1449a(i, stackTraceElement.getClassName());
            NativeImpl.m1449a(i, ".");
            NativeImpl.m1449a(i, stackTraceElement.getMethodName());
            if (stackTraceElement.isNativeMethod()) {
                NativeImpl.m1449a(i, "(Native Method)");
            } else if (stackTraceElement.getFileName() != null) {
                if (stackTraceElement.getLineNumber() >= 0) {
                    NativeImpl.m1449a(i, "(");
                    NativeImpl.m1449a(i, stackTraceElement.getFileName());
                    NativeImpl.m1449a(i, CertificateUtil.DELIMITER);
                    NativeImpl.m1449a(i, String.valueOf(stackTraceElement.getLineNumber()));
                    NativeImpl.m1449a(i, ")");
                } else {
                    NativeImpl.m1449a(i, "(");
                    NativeImpl.m1449a(i, stackTraceElement.getFileName());
                    NativeImpl.m1449a(i, ")");
                }
            } else if (stackTraceElement.getLineNumber() >= 0) {
                NativeImpl.m1449a(i, "(Unknown Source:");
                NativeImpl.m1449a(i, String.valueOf(stackTraceElement.getLineNumber()));
                NativeImpl.m1449a(i, ")");
            } else {
                NativeImpl.m1449a(i, "(Unknown Source)");
            }
            NativeImpl.m1449a(i, "\n");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1419a(Throwable th, int i) {
        if (th == null || i <= 0) {
            return;
        }
        try {
            m1427b(th, i);
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                m1418a(stackTraceElement, i);
            }
            for (Throwable th2 : th.getSuppressed()) {
                m1420a(th2, i, "Suppressed: ", "\t");
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                m1420a(cause, i, "Caused by: ", "");
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1420a(Throwable th, int i, String str, String str2) {
        while (true) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            try {
                NativeImpl.m1449a(i, str2);
                NativeImpl.m1449a(i, str);
            } catch (Throwable unused) {
            }
            m1427b(th, i);
            for (StackTraceElement stackTraceElement : stackTrace) {
                m1418a(stackTraceElement, i);
            }
            for (Throwable th2 : th.getSuppressed()) {
                m1420a(th2, i, "Suppressed: ", str2 + "\t");
            }
            th = th.getCause();
            if (th == null) {
                return;
            } else {
                str = "Caused by: ";
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1421a(Throwable th, PrintWriter printWriter) {
        if (th == null) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.add(th);
        printWriter.println(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = stackTrace.length > 384;
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (z && i > 256) {
                StringBuilder sb = new StringBuilder("\t... skip ");
                sb.append((stackTrace.length - i) - 128);
                sb.append(" lines");
                printWriter.println(sb.toString());
                break;
            }
            printWriter.println("\tat ".concat(String.valueOf(stackTraceElement)));
            i++;
        }
        if (z) {
            for (int length = stackTrace.length - 128; length < stackTrace.length; length++) {
                printWriter.println("\tat " + stackTrace[length]);
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            m1422a(th2, printWriter, "Suppressed: ", "\t", setNewSetFromMap, 128);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            m1422a(cause, printWriter, "Caused by: ", "", setNewSetFromMap, 128);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1422a(Throwable th, PrintWriter printWriter, String str, String str2, Set<Throwable> set, int i) {
        while (!set.contains(th)) {
            set.add(th);
            StackTraceElement[] stackTrace = th.getStackTrace();
            boolean z = stackTrace.length > i;
            printWriter.println(str2 + str + th);
            int length = stackTrace.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                StackTraceElement stackTraceElement = stackTrace[i3];
                if (z && i2 > i) {
                    printWriter.println("\t... skip " + ((stackTrace.length - i2) - (i / 2)) + " lines");
                    break;
                }
                printWriter.println("\tat ".concat(String.valueOf(stackTraceElement)));
                i2++;
            }
            if (z) {
                for (int length2 = stackTrace.length - (i / 2); length2 < stackTrace.length; length2++) {
                    printWriter.println("\tat " + stackTrace[length2]);
                }
            }
            for (Throwable th2 : th.getSuppressed()) {
                int i4 = i / 2;
                m1422a(th2, printWriter, "Suppressed: ", str2 + "\t", set, i4 > 10 ? i4 : 10);
            }
            PrintWriter printWriter2 = printWriter;
            Set<Throwable> set2 = set;
            th = th.getCause();
            if (th == null) {
                return;
            }
            i /= 2;
            if (i <= 10) {
                i = 10;
            }
            str = "Caused by: ";
            printWriter = printWriter2;
            set = set2;
        }
        printWriter.println("\t[CIRCULAR REFERENCE:" + th + C11744X3.j.f26440e);
    }

    /* JADX INFO: renamed from: a */
    private static void m1423a(Throwable th, List<StackTraceElement> list) {
        if (th == null) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.add(th);
        list.add(f742a);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = stackTrace.length > 384;
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (z && i > 256) {
                list.add(f742a);
                break;
            } else {
                list.add(stackTraceElement);
                i++;
            }
        }
        if (z) {
            for (int length = stackTrace.length - 128; length < stackTrace.length; length++) {
                list.add(stackTrace[length]);
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            m1424a(th2, list, "\t", setNewSetFromMap, 128);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            m1424a(cause, list, "", setNewSetFromMap, 128);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m1424a(Throwable th, List<StackTraceElement> list, String str, Set<Throwable> set, int i) {
        while (!set.contains(th)) {
            set.add(th);
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i2 = 0;
            boolean z = stackTrace.length > i;
            list.add(f742a);
            int i3 = 0;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (z && i3 > i) {
                    list.add(f742a);
                    break;
                } else {
                    list.add(stackTraceElement);
                    i3++;
                }
            }
            if (z) {
                for (int length = stackTrace.length - (i / 2); length < stackTrace.length; length++) {
                    list.add(stackTrace[length]);
                }
            }
            Throwable[] suppressed = th.getSuppressed();
            int length2 = suppressed.length;
            while (true) {
                int i4 = 10;
                if (i2 >= length2) {
                    break;
                }
                Throwable th2 = suppressed[i2];
                String str2 = str + "\t";
                int i5 = i / 2;
                if (i5 > 10) {
                    i4 = i5;
                }
                m1424a(th2, list, str2, set, i4);
                i2++;
            }
            th = th.getCause();
            if (th == null) {
                return;
            }
            i /= 2;
            if (i <= 10) {
                i = 10;
            }
        }
        list.add(f742a);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m1425a(String str, String[] strArr) {
        if (strArr != null && !TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m1426b(String str) {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            JSONObject jSONObject = new JSONObject();
            if (allStackTraces == null) {
                return null;
            }
            jSONObject.put("thread_all_count", allStackTraces.size());
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                Thread key = entry.getKey();
                String name = key.getName();
                if (!m1429c(name) && (str == null || (!str.equals(name) && !name.startsWith(str) && !name.endsWith(str)))) {
                    jSONObject2.put("thread_name", key.getName() + "(" + key.getId() + ")");
                    StackTraceElement[] value = entry.getValue();
                    if (value != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (StackTraceElement stackTraceElement : value) {
                            jSONArray2.put(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "(" + stackTraceElement.getLineNumber() + ")");
                        }
                        jSONObject2.put("thread_stack", jSONArray2);
                        if (jSONArray2.length() > 0) {
                        }
                    }
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("thread_stacks", jSONArray);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m1427b(Throwable th, int i) {
        th.getClass().getName();
        String localizedMessage = th.getLocalizedMessage();
        try {
            NativeImpl.m1449a(i, th.getClass().getName());
            if (localizedMessage != null) {
                NativeImpl.m1449a(i, ": ");
                NativeImpl.m1449a(i, localizedMessage);
            }
            NativeImpl.m1449a(i, "\n");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static StackTraceElement[] m1428b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        try {
            m1423a(th, arrayList);
        } catch (Throwable unused) {
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]);
    }

    /* JADX INFO: renamed from: c */
    private static boolean m1429c(String str) {
        Set<String> setM1347a = C1431g.m1347a();
        if (setM1347a.contains(str)) {
            return true;
        }
        for (String str2 : setM1347a) {
            if (!TextUtils.isEmpty(str) && str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1430c(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            if (th instanceof OutOfMemoryError) {
                return true;
            }
            if (i > 20) {
                return false;
            }
            i++;
            try {
                th = th.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1431d(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            try {
                if ((th instanceof OutOfMemoryError) && (th.getMessage().contains("allocate") || th.getMessage().contains("thrown"))) {
                    return true;
                }
                if (i > 20) {
                    return false;
                }
                i++;
                th = th.getCause();
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }
}
