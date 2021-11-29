import { NativeModules } from "react-native";

const { AndroidKeyboardAdjust } = NativeModules;

export const adjustResize = () => AndroidKeyboardAdjust.setAdjustResize();

export const adjustPan = () => AndroidKeyboardAdjust.setAdjustPan();

export const adjustNothing = () => AndroidKeyboardAdjust.setAdjustNothing();

export const adjustUnspecified = () =>
  AndroidKeyboardAdjust.setAdjustUnspecified();

export default {
  adjustResize,
  adjustPan,
  adjustNothing,
  adjustUnspecified,
};
