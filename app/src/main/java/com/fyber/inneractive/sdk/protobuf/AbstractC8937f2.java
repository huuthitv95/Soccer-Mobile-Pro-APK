package com.fyber.inneractive.sdk.protobuf;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11744X3;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.f2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8937f2 {
    /* JADX INFO: renamed from: a */
    public static final String m21539a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0204  */
    /* JADX WARN: Code duplicated, block: B:88:0x0206  */
    /* JADX INFO: renamed from: a */
    public static void m21540a(InterfaceC8925d2 interfaceC8925d2, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC8925d2.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            boolean zBooleanValue = true;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String str2 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1, strSubstring.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m21541a(sb, i, m21539a(str2), AbstractC9047z0.invokeOrDie(method2, interfaceC8925d2, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String str3 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1, strSubstring.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m21541a(sb, i, m21539a(str3), AbstractC9047z0.invokeOrDie(method3, interfaceC8925d2, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strSubstring))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    if (map.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                    }
                }
                String str4 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1);
                Method method4 = (Method) map.get("get".concat(strSubstring));
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objInvokeOrDie = AbstractC9047z0.invokeOrDie(method4, interfaceC8925d2, new Object[0]);
                    if (method5 == null) {
                        if (objInvokeOrDie instanceof Boolean) {
                            zEquals = !((Boolean) objInvokeOrDie).booleanValue();
                        } else if (objInvokeOrDie instanceof Integer) {
                            if (((Integer) objInvokeOrDie).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objInvokeOrDie instanceof Float) {
                            if (((Float) objInvokeOrDie).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objInvokeOrDie instanceof Double) {
                            if (((Double) objInvokeOrDie).doubleValue() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objInvokeOrDie instanceof String) {
                            zEquals = objInvokeOrDie.equals("");
                        } else if (objInvokeOrDie instanceof AbstractC9011s) {
                            zEquals = objInvokeOrDie.equals(AbstractC9011s.f21106b);
                        } else if (!(objInvokeOrDie instanceof InterfaceC8925d2) ? !((objInvokeOrDie instanceof Enum) && ((Enum) objInvokeOrDie).ordinal() == 0) : objInvokeOrDie != ((InterfaceC8925d2) objInvokeOrDie).getDefaultInstanceForType()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) AbstractC9047z0.invokeOrDie(method5, interfaceC8925d2, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m21541a(sb, i, m21539a(str4), objInvokeOrDie);
                    }
                }
            }
        }
        if (interfaceC8925d2 instanceof GeneratedMessageLite$ExtendableMessage) {
            Iterator itM21684d = ((GeneratedMessageLite$ExtendableMessage) interfaceC8925d2).extensions.m21684d();
            while (itM21684d.hasNext()) {
                Map.Entry entry = (Map.Entry) itM21684d.next();
                m21541a(sb, i, C11744X3.j.f26438d + ((C9032w0) entry.getKey()).f21150b + C11744X3.j.f26440e, entry.getValue());
            }
        }
        C8986n3 c8986n3 = ((AbstractC9047z0) interfaceC8925d2).unknownFields;
        if (c8986n3 != null) {
            for (int i2 = 0; i2 < c8986n3.f21078a; i2++) {
                m21541a(sb, i, String.valueOf(c8986n3.f21079b[i2] >>> 3), c8986n3.f21080c[i2]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m21541a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m21541a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m21541a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(AbstractC8950h3.m21620a(AbstractC9011s.m21713a((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC9011s) {
            sb.append(": \"");
            sb.append(AbstractC8950h3.m21620a((AbstractC9011s) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC9047z0) {
            sb.append(" {");
            m21540a((AbstractC9047z0) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        m21541a(sb, i4, "key", entry.getKey());
        m21541a(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }
}
