 var id=document.getElementById("getPhoto");
 console.log(id);
   id.addEventListener('click', getPhoto);

function getPhoto() {
    fetch('https://jsonplaceholder.typicode.com/photos')
        .then((res) => res.json())
        .then((data) => {
            let output = '<h2>Photos</h2>';
            data.forEach(function (photo) {
                output += `
                <div>
                    <img src="${photo.url}">
                 </div>
                `;
            });
            document.getElementById('output').innerHTML = output;
        })
}


