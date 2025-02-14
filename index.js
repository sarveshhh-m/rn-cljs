import { registerRootComponent } from "expo";
import "./expo-cljs/index";

if (global.demo?.core?.init) {
  console.log("✅ Calling demo.core.init()");
  registerRootComponent(global.demo.core.init);
} else {
  console.error("❌ demo.core.init is undefined!");
}
