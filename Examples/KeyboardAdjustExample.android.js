'use strict';

var React = require('react-native');
var {
    AppRegistry,
    StyleSheet,
    Text,
    TextInput,
    TouchableWithoutFeedback,
    View
} = React;

var dismissKeyboard = require('dismissKeyboard');
var AndroidKeyboardAdjust = require('NativeModules').AndroidKeyboardAdjust;

var KeyboardAdjustExample = React.createClass({
    getInitialState: function() {
        return {
            setting: 'nothing'
        };
    },

    setKeyboardSetting: function(setting) {
        this.setState({setting: setting});

        switch (setting) {
            case 'nothing':
                AndroidKeyboardAdjust.setAdjustNothing();
                break;
            case 'pan':
                AndroidKeyboardAdjust.setAdjustPan();
                break;
            case 'resize':
                AndroidKeyboardAdjust.setAdjustResize();
                break;
            case 'unspecified':
                AndroidKeyboardAdjust.setAdjustUnspecified();
                break;
        }
    },

    render: function() {
        return (
            <View style={styles.container}>
                <View style={styles.settingButtons}>
                    <TouchableWithoutFeedback onPress={() => this.setKeyboardSetting('nothing')}>
                        <View style={[styles.settingButton, this.state.setting == 'nothing' ? {backgroundColor: 'green'} : {}]}>
                            <Text style={styles.settingButtonText}>Adjust Nothing</Text>
                        </View>
                    </TouchableWithoutFeedback>
                    <TouchableWithoutFeedback onPress={() => this.setKeyboardSetting('pan')}>
                        <View style={[styles.settingButton, this.state.setting == 'pan' ? {backgroundColor: 'green'} : {}]}>
                            <Text style={styles.settingButtonText}>Adjust Pan</Text>
                        </View>
                    </TouchableWithoutFeedback>
                </View>
                <View style={styles.settingButtons}>
                    <TouchableWithoutFeedback onPress={() => this.setKeyboardSetting('resize')}>
                        <View style={[styles.settingButton, this.state.setting == 'resize' ? {backgroundColor: 'green'} : {}]}>
                            <Text style={styles.settingButtonText}>Adjust Resize</Text>
                        </View>
                    </TouchableWithoutFeedback>
                    <TouchableWithoutFeedback onPress={() => this.setKeyboardSetting('unspecified')}>
                        <View style={[styles.settingButton, this.state.setting == 'unspecified' ? {backgroundColor: 'green'} : {}]}>
                            <Text style={styles.settingButtonText}>Adjust Unspecified</Text>
                        </View>
                    </TouchableWithoutFeedback>
                </View>
                <View style={styles.settingButtons}>
                    <TouchableWithoutFeedback onPress={() => dismissKeyboard()}>
                        <View style={styles.settingButton}>
                            <Text style={styles.settingButtonText}>Hide Keyboard</Text>
                        </View>
                    </TouchableWithoutFeedback>
                </View>
                <View style={{flex: 1}} />
                <View style={styles.inputBox}>
                    <TextInput
                        style={styles.inputBoxText}
                        placeholder={'Enter Text Here...'}
                        underlineColorAndroid={'transparent'}
                    />
                </View>
            </View>
        );
    }
});

var styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: 'red',
        borderRadius: 20
    },
    settingButtons: {
        flexDirection: 'row',
        margin: 5,
        marginBottom: 0
    },
    settingButton: {
        flex: 1,
        backgroundColor: 'white',
        borderRadius: 5,
        margin: 5,
        marginBottom: 0
    },
    settingButtonText: {
        textAlign: 'center',
        color: 'black',
        margin: 10
    },
    inputBox: {
        backgroundColor: 'white',
        borderRadius: 5,
        margin: 10
    },
    inputBoxText: {
        backgroundColor: 'transparent',
    },
});

AppRegistry.registerComponent('KeyboardAdjustExample', () => KeyboardAdjustExample);

module.exports = KeyboardAdjustExample;
