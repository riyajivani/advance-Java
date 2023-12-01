$(function () {

    var websocket;


    function setupWebSocket() {
        var uri = "ws://" + document.location.host + '/WebSocketParameter/' + "connect/" + $("#userName").val();
        websocket = new WebSocket(uri);

        websocket.onmessage = function (evt) {
            var time = new Date().toTimeString();

            print("Received at " + time + ": " + evt.data);
        };

        websocket.onopen = function (evt) {
            console.log(evt);
        };
    }

    $("#userName").blur(function () {
        if ($("#userName").val() !== null) {
            setupWebSocket();
        }
    });

    $("#button").click(function () {
        console.log($("#userName").val());

        var time = new Date().toTimeString();
        websocket.send(message.value);
        print("Sent at " + time + ': ' + message.value);
        message.value = '';

    });


    function print(message) {
        var messageArea = document.getElementById("messages");

        var label = document.createElement('p');
        label.style.wordWrap = "break-word";
        label.innerHTML = message;
        messageArea.appendChild(label);
    }


});