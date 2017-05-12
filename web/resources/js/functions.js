function loadKysely() {
    var xhttp = new XMLHttpRequest();
    xhttp.overrideMimeType("application/json"); /* Tällä rivillä huijataan koodia hakemaan JSON serverin sijaan MOCK-kansiosta! */
    xhttp.open("GET", "kysely.json", true);
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var kyselyObj = JSON.parse(this.responseText);
            document.getElementById('form-heading').innerHTML = kyselyObj.nimi;
            var txt = '';
            for (var i = 0; i < kyselyObj.kysymykset.length; i++) {
                txt += "<div id='form-element'><ul>" + "<h4>" + kyselyObj.kysymykset[i].teksti + "</h4>"
                var kysymys = kyselyObj.kysymykset[i];
                for (var j = 0; j < kysymys.vaihtoehdot.length; j++) {
                    txt += "<li><input type='radio'>" + kyselyObj.kysymykset[i].vaihtoehdot[j].vaihtoehto + "</input></li>";
                }
                txt += "</ul></div>"
            }
            document.getElementById('kysely').innerHTML = txt + "<input id='submit_button' type='submit' name='submit' value='Lähetä' />";
        }
    };
    xhttp.send(null); /* Nullin paikalla olisi normaalisti tyhjää */
};
