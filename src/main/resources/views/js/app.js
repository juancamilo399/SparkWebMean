var button = document.getElementById('button-calculator');
console.log(button);

button.addEventListener('click', function () {
    var numbers = document.getElementById('inputnumbers').value;
    var numbers_list = numbers.split(",");
    var table = $('#datatable');
    $('#tablebody').empty();
    $('#tablefooter').empty();
    for (i = 0; i < numbers_list.length; i++) {
        $("#tablebody").append("<tr><td>" + numbers_list[i] + "</td></tr>");

    }

    axios.post('https://arep-median-spark.herokuapp.com/calculator/calculate/', numbers)
        .then(res => {
            var obj = JSON.parse(res.data);
            $("#tablefooter").append( "mean: " + obj.mean  +  "     Standard deviation: " + obj.std );
        })
        .catch(function (error) {
            console.log(error);
        })
});