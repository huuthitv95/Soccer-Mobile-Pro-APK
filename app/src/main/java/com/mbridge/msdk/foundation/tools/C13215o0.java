package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.C13009d;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.image.C13103e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.o0 */
/* JADX INFO: compiled from: SameFileTool.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13215o0 extends C13230w {

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.o0$a */
    /* JADX INFO: compiled from: SameFileTool.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
                if (c13635gM39718d == null) {
                    c13635gM39718d = C13636h.m39706b().m39708a();
                }
                C13215o0.m37800b(C13098e.m37149b(EnumC13096c.MBRIDGE_RES_MANAGER_DIR), c13635gM39718d.m39431O());
                C13215o0.m37792a(System.currentTimeMillis() - ((long) (c13635gM39718d.m39494e() * 1000)));
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.o0$b */
    /* JADX INFO: compiled from: SameFileTool.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C13008c.m36588n().m36542d() != null) {
                    C13215o0.m37799b(C13098e.m37149b(EnumC13096c.MBRIDGE_VC));
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.o0$c */
    /* JADX INFO: compiled from: SameFileTool.java */
    class c implements FileFilter {
        c() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.isHidden() || file.isDirectory();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.o0$d */
    /* JADX INFO: compiled from: SameFileTool.java */
    class d implements Comparator<File> {
        d() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long jLastModified = file.lastModified() - file2.lastModified();
            if (jLastModified > 0) {
                return 1;
            }
            return jLastModified == 0 ? 0 : -1;
        }

        @Override // java.util.Comparator
        public boolean equals(Object obj) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m37800b(String str, int i) {
        try {
            if (m37803d(new File(str)) > i * 1048576) {
                m37807f(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable unused) {
            C13219q0.m37816b("SameFileTool", "clean memory failed");
        }
    }

    /* JADX INFO: renamed from: c */
    public static File[] m37802c(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.listFiles();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX INFO: renamed from: e */
    public static String m37805e(File file) throws Throwable {
        IOException e;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            if (file == 0) {
                return null;
            }
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    try {
                        file = new StringBuffer();
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                file.append(line + "\n");
                            } catch (IOException e2) {
                                e = e2;
                                try {
                                    e.printStackTrace();
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                        file = file;
                                    }
                                    if (file != 0) {
                                        return file.toString();
                                    }
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader2 = bufferedReader;
                                    bufferedReader = bufferedReader2;
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    throw th;
                                }
                            }
                        }
                        bufferedReader.close();
                        file = file;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    file = 0;
                }
            } catch (IOException e4) {
                e = e4;
                file = 0;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
        if (file != 0) {
            return file.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m37807f(String str) {
        try {
            ArrayList<File> arrayListM37797b = m37797b(new File(str));
            Collections.sort(arrayListM37797b, new d());
            int size = (arrayListM37797b.size() - 1) / 2;
            for (int i = 0; i < size; i++) {
                File file = arrayListM37797b.get(i);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
            C13219q0.m37816b("SameFileTool", "del memory failed");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37793a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d == null) {
                c13635gM39718d = C13636h.m39706b().m39708a();
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - ((long) (c13635gM39718d.m39494e() * 1000));
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.lastModified() + jCurrentTimeMillis < jCurrentTimeMillis2) {
                            m37789a(file2);
                            try {
                                File file3 = new File(str + ".zip");
                                if (file3.exists() && file3.isFile()) {
                                    m37789a(file3);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m37804d(String str) {
        return !TextUtils.isEmpty(str) ? SameMD5.getMD5(C13188c1.m37646b(str.trim())) : "";
    }

    /* JADX INFO: renamed from: c */
    private static long m37801c(File file) throws Exception {
        FileInputStream fileInputStream;
        long jAvailable = 0;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    if (file.exists()) {
                        fileInputStream = new FileInputStream(file);
                        try {
                            jAvailable = fileInputStream.available();
                            fileInputStream2 = fileInputStream;
                        } catch (Exception e) {
                            e = e;
                            fileInputStream2 = fileInputStream;
                            e.printStackTrace();
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            return 0L;
                        } catch (Throwable th) {
                            th = th;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        file.createNewFile();
                        C13219q0.m37816b("获取文件大小", "文件不存在!");
                    }
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    return jAvailable;
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    private static long m37803d(File file) throws Exception {
        long jM37801c;
        File[] fileArrListFiles = file.listFiles();
        long j = 0;
        if (fileArrListFiles != null) {
            for (int i = 0; i < fileArrListFiles.length; i++) {
                if (fileArrListFiles[i].isDirectory()) {
                    jM37801c = m37803d(fileArrListFiles[i]);
                } else {
                    jM37801c = m37801c(fileArrListFiles[i]);
                }
                j += jM37801c;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: b */
    public static void m37798b() {
        new Thread(new b()).start();
    }

    /* JADX INFO: renamed from: a */
    public static void m37791a() {
        a aVar = new a();
        if (C13009d.m36589a().m36605e()) {
            C13167a.m37543b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m37799b(String str) {
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                for (File file2 : m37802c(str)) {
                    if (file2.exists() && file2.isFile()) {
                        file2.delete();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m37806e(String str) {
        if (C13103e.m37178a(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    /* JADX INFO: renamed from: b */
    private static ArrayList<File> m37797b(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : file.listFiles(new c())) {
            if (!file2.isDirectory()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(m37797b(file2));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static void m37792a(long j) {
        try {
            for (File file : m37797b(new File(C13098e.m37149b(EnumC13096c.MBRIDGE_RES_MANAGER_DIR)))) {
                if (file.lastModified() < j && file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Throwable th) {
            C13219q0.m37817b("SameFileTool", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m37789a(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return "";
            }
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    for (File file2 : fileArrListFiles) {
                        m37789a(file2);
                    }
                    file.delete();
                    return "";
                }
                file.delete();
            }
            return "";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static String m37796b(String str, String str2) throws Throwable {
        Throwable th;
        InputStream inputStream;
        IOException iOException;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        IOException e;
        Throwable th2;
        if (str != null && str2 != null) {
            if (!str2.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                str2 = str2 + RemoteSettings.FORWARD_SLASH_STRING;
            }
            File file = new File(str);
            if (!file.exists()) {
                return "unzip file not exists";
            }
            FileOutputStream fileOutputStream2 = null;
            InputStream inputStream3 = null;
            FileOutputStream fileOutputStream3 = null;
            try {
                ZipFile zipFile = new ZipFile(file);
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                FileOutputStream fileOutputStream4 = null;
                while (true) {
                    try {
                        try {
                            String canonicalPath = "";
                            if (enumerationEntries.hasMoreElements()) {
                                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                                if (zipEntryNextElement == null) {
                                    if (inputStream3 != null) {
                                        try {
                                            inputStream3.close();
                                        } catch (IOException e2) {
                                            C13219q0.m37817b("SameFileTool", "unzip error", e2);
                                        }
                                    }
                                    if (fileOutputStream4 != null) {
                                        try {
                                            fileOutputStream4.close();
                                        } catch (IOException e3) {
                                            C13219q0.m37817b("SameFileTool", "unzip error", e3);
                                        }
                                    }
                                    return "unzip zipEntry is null";
                                }
                                String name = zipEntryNextElement.getName();
                                if (!TextUtils.isEmpty(name) && !name.startsWith("..") && !name.startsWith("../")) {
                                    File file2 = new File(str2 + name);
                                    try {
                                        canonicalPath = file2.getCanonicalPath();
                                    } catch (IOException unused) {
                                    }
                                    if (!TextUtils.isEmpty(canonicalPath) && canonicalPath.startsWith(str2) && !canonicalPath.startsWith("..") && !canonicalPath.startsWith("../")) {
                                        if (zipEntryNextElement.isDirectory()) {
                                            file2.mkdirs();
                                        } else {
                                            if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                                                file2.getParentFile().mkdirs();
                                            }
                                            fileOutputStream = new FileOutputStream(file2);
                                            try {
                                                inputStream3 = zipFile.getInputStream(zipEntryNextElement);
                                                byte[] bArr = new byte[1024];
                                                while (true) {
                                                    int i = inputStream3.read(bArr, 0, 1024);
                                                    if (i == -1) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, i);
                                                    fileOutputStream.flush();
                                                }
                                                fileOutputStream4 = fileOutputStream;
                                            } catch (IOException e4) {
                                                e = e4;
                                            } catch (Throwable th3) {
                                                th2 = th3;
                                                if (inputStream3 != null) {
                                                    try {
                                                        inputStream3.close();
                                                    } catch (IOException e5) {
                                                        C13219q0.m37817b("SameFileTool", "unzip error", e5);
                                                    }
                                                }
                                                if (fileOutputStream != null) {
                                                    try {
                                                        fileOutputStream.close();
                                                        throw th2;
                                                    } catch (IOException e6) {
                                                        C13219q0.m37817b("SameFileTool", "unzip error", e6);
                                                        throw th2;
                                                    }
                                                }
                                                throw th2;
                                            }
                                        }
                                    }
                                    if (inputStream3 != null) {
                                        try {
                                            inputStream3.close();
                                        } catch (IOException e7) {
                                            C13219q0.m37817b("SameFileTool", "unzip error", e7);
                                        }
                                    }
                                    if (fileOutputStream4 != null) {
                                        try {
                                            fileOutputStream4.close();
                                        } catch (IOException e8) {
                                            C13219q0.m37817b("SameFileTool", "unzip error", e8);
                                        }
                                    }
                                    return "unzip zipEntry canonicalPath is not available";
                                }
                                if (inputStream3 != null) {
                                    try {
                                        inputStream3.close();
                                    } catch (IOException e9) {
                                        C13219q0.m37817b("SameFileTool", "unzip error", e9);
                                    }
                                }
                                if (fileOutputStream4 != null) {
                                    try {
                                        fileOutputStream4.close();
                                    } catch (IOException e10) {
                                        C13219q0.m37817b("SameFileTool", "unzip error", e10);
                                    }
                                }
                                return "unzip zipEntry name is not available";
                            }
                            zipFile.close();
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (IOException e11) {
                                    C13219q0.m37817b("SameFileTool", "unzip error", e11);
                                }
                            }
                            if (fileOutputStream4 != null) {
                                try {
                                    fileOutputStream4.close();
                                } catch (IOException e12) {
                                    C13219q0.m37817b("SameFileTool", "unzip error", e12);
                                }
                            }
                            return "";
                        } catch (IOException e13) {
                            iOException = e13;
                            inputStream2 = inputStream3;
                            fileOutputStream3 = fileOutputStream4;
                            fileOutputStream = fileOutputStream3;
                            inputStream3 = inputStream2;
                            e = iOException;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = inputStream3;
                        fileOutputStream2 = fileOutputStream4;
                        fileOutputStream = fileOutputStream2;
                        inputStream3 = inputStream;
                        th2 = th;
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                            throw th2;
                        }
                        throw th2;
                    }
                    try {
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37817b("SameFileTool", "unzip error", e);
                        }
                        String message = e.getMessage();
                        if (inputStream3 != null) {
                            try {
                                inputStream3.close();
                            } catch (IOException e14) {
                                C13219q0.m37817b("SameFileTool", "unzip error", e14);
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e15) {
                                C13219q0.m37817b("SameFileTool", "unzip error", e15);
                            }
                        }
                        return message;
                    } catch (Throwable th5) {
                        th = th5;
                        inputStream = inputStream3;
                        fileOutputStream2 = fileOutputStream;
                        fileOutputStream = fileOutputStream2;
                        inputStream3 = inputStream;
                        th2 = th;
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                            throw th2;
                        }
                        throw th2;
                    }
                }
            } catch (IOException e16) {
                iOException = e16;
                inputStream2 = null;
            } catch (Throwable th6) {
                th = th6;
                inputStream = null;
            }
        } else {
            return "unzip srcFile or destDir is null ";
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m37790a(String str, String str2) throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                File file = new File(str + File.separator + "template_config.json");
                if (file.isFile() && file.exists()) {
                    String strM37805e = m37805e(file);
                    if (!TextUtils.isEmpty(strM37805e)) {
                        try {
                            JSONArray jSONArray = new JSONArray(strM37805e);
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i);
                                if (jSONObject != null && str2.equals(jSONObject.optString("xml_type"))) {
                                    arrayList.add(str + File.separator + jSONObject.optString("name"));
                                    if (jSONObject.has("ext_template")) {
                                        jSONObject.put("folder_dir", str);
                                        arrayList.add(jSONObject.toString());
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } catch (JSONException e) {
                            C13219q0.m37816b("SameFileTool", e.getMessage());
                        }
                    }
                }
                arrayList.add(str);
                return arrayList;
            }
        } catch (Exception e2) {
            C13219q0.m37816b("SameFileTool", e2.getMessage());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m37795a(byte[] bArr, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (file.getParentFile() != null && !file.exists()) {
                    file.getParentFile().mkdirs();
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArr);
                    try {
                        fileOutputStream.close();
                        return true;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return true;
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    if (fileOutputStream2 == null) {
                        return false;
                    }
                    try {
                        fileOutputStream2.close();
                        return false;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }
}
