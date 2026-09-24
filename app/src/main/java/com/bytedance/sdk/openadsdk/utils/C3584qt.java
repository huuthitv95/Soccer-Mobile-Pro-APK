package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3215ik;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C3584qt {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.qt$1, reason: invalid class name */
    static class AnonymousClass1 implements FilenameFilter {

        /* JADX INFO: renamed from: ri */
        private final Pattern f13228ri = Pattern.compile("^cpu[0-9]+$");

        AnonymousClass1() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f13228ri.matcher(str).matches();
        }
    }

    /* JADX INFO: renamed from: ik */
    public static int m16629ik() {
        return C3215ik.m13505ri().m13506lr("cpu_max_frequency", 0);
    }

    /* JADX INFO: renamed from: ka */
    public static int m16630ka() {
        return C3215ik.m13505ri().m13506lr("cpu_min_frequency", 0);
    }

    /* JADX INFO: renamed from: lr */
    public static int m16631lr() {
        return C3215ik.m13505ri().m13506lr("cpu_count", 0);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[Catch: Exception -> 0x0063, TRY_LEAVE, TryCatch #6 {Exception -> 0x0063, blocks: (B:24:0x005b, B:26:0x0060), top: B:50:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006d A[Catch: Exception -> 0x0070, TRY_LEAVE, TryCatch #0 {Exception -> 0x0070, blocks: (B:30:0x0068, B:32:0x006d), top: B:38:0x0068 }] */
    /* JADX INFO: renamed from: lr */
    public static int m16632lr(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        int i2;
        int i3 = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        while (true) {
            i--;
            if (i < 0) {
                return i3;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_min_freq");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader2);
                    try {
                        String line = bufferedReader3.readLine();
                        if (!TextUtils.isEmpty(line) && ((i2 = Integer.parseInt(line)) < i3 || i3 == 0)) {
                            i3 = i2;
                        }
                        try {
                            bufferedReader3.close();
                            fileReader2.close();
                        } catch (Exception unused) {
                        }
                        bufferedReader2 = bufferedReader3;
                        fileReader = fileReader2;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        try {
                            C2707ac.m10196ik("CpuUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (Exception unused2) {
                                    bufferedReader2 = bufferedReader;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            bufferedReader2 = bufferedReader;
                        } catch (Throwable th3) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (Exception unused3) {
                                    throw th3;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    BufferedReader bufferedReader4 = bufferedReader2;
                    th = th4;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th5) {
                bufferedReader = bufferedReader2;
                th = th5;
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static int m16633ri() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d A[Catch: Exception -> 0x0060, TRY_LEAVE, TryCatch #0 {Exception -> 0x0060, blocks: (B:22:0x0058, B:24:0x005d), top: B:36:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006a A[Catch: Exception -> 0x006d, TRY_LEAVE, TryCatch #2 {Exception -> 0x006d, blocks: (B:28:0x0065, B:30:0x006a), top: B:40:0x0065 }] */
    /* JADX INFO: renamed from: ri */
    public static int m16634ri(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        int i2;
        int i3 = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        while (true) {
            i--;
            if (i < 0) {
                return i3;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader2);
                    try {
                        String line = bufferedReader3.readLine();
                        if (!TextUtils.isEmpty(line) && (i2 = Integer.parseInt(line)) > i3) {
                            i3 = i2;
                        }
                        try {
                            bufferedReader3.close();
                            fileReader2.close();
                        } catch (Exception unused) {
                        }
                        bufferedReader2 = bufferedReader3;
                        fileReader = fileReader2;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        try {
                            C2707ac.m10196ik("CpuUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (Exception unused2) {
                                    bufferedReader2 = bufferedReader;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            bufferedReader2 = bufferedReader;
                        } catch (Throwable th3) {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                } catch (Exception unused3) {
                                    throw th3;
                                }
                            } else if (fileReader != null) {
                                fileReader.close();
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    BufferedReader bufferedReader4 = bufferedReader2;
                    th = th4;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th5) {
                bufferedReader = bufferedReader2;
                th = th5;
            }
        }
    }
}
