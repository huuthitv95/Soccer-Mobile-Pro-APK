package com.pgl.ssdk;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.internal.security.CertificateUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.pgl.ssdk.ac */
/* JADX INFO: loaded from: classes7.dex */
public class C14245ac {

    /* JADX INFO: renamed from: a */
    private static final FileFilter f41222a = new a();

    /* JADX INFO: renamed from: com.pgl.ssdk.ac$a */
    static class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m42919a() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(f41222a).length;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX INFO: renamed from: a */
    private static String m42920a(String str) {
        BufferedReader bufferedReader;
        FileReader fileReader;
        String line = null;
        try {
            try {
                fileReader = new FileReader(str);
                try {
                    bufferedReader = new BufferedReader(fileReader);
                    try {
                        line = bufferedReader.readLine();
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        if (fileReader != null) {
                        }
                        if (line == null) {
                            return "0";
                        }
                        return line.trim();
                    }
                } catch (Throwable unused4) {
                    bufferedReader = null;
                }
            } catch (Throwable unused5) {
                bufferedReader = null;
                fileReader = null;
            }
            fileReader.close();
        } catch (Throwable unused6) {
        }
        if (line == null) {
            return "0";
        }
        return line.trim();
    }

    /* JADX INFO: renamed from: a */
    private static String m42921a(HashMap<String, String> map, String str) {
        String str2;
        try {
            str2 = map.get(str);
        } catch (Throwable unused) {
            str2 = null;
        }
        return str2 == null ? "" : str2.trim();
    }

    /* JADX INFO: renamed from: b */
    private static HashMap<String, String> m42922b() {
        FileReader fileReader;
        HashMap<String, String> map = new HashMap<>();
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            try {
                                break;
                            } catch (Throwable unused) {
                            }
                        } else {
                            String[] strArrSplit = line.split(CertificateUtil.DELIMITER, 2);
                            if (strArrSplit.length >= 2) {
                                String strTrim = strArrSplit[0].trim();
                                String strTrim2 = strArrSplit[1].trim();
                                if (map.get(strTrim) == null) {
                                    map.put(strTrim, strTrim2);
                                } else {
                                    continue;
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        if (fileReader != null) {
                        }
                        return map;
                    }
                }
                bufferedReader2.close();
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            fileReader = null;
        }
        try {
            fileReader.close();
        } catch (Throwable unused6) {
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public static String m42923c() {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap<String, String> mapM42922b = m42922b();
            jSONObject.put("core", m42919a());
            jSONObject.put("hw", m42921a(mapM42922b, "Hardware"));
            jSONObject.put("max", m42920a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
            jSONObject.put("min", m42920a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"));
            jSONObject.put("ft", m42921a(mapM42922b, "Features"));
        } catch (Throwable unused) {
        }
        String string = jSONObject.toString();
        return string == null ? JsonUtils.EMPTY_JSON : string.trim();
    }
}
