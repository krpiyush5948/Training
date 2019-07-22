function getPhotos() {
    
    var url = 'https://jsonplaceholder.typicode.com/photos';

    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            updatePhoto(JSON.parse(this.responseText));
        }
    };
    xhttp.open("GET", url, true);
    xhttp.send();
}

function updatePhoto(response) {
    for (var i = 0; i < response.length; i++) {
        var photo = response[i];

        let photoElement = document.createElement('div');
        photoElement.className = 'photo';

        var title = document.createElement('p');
        title.innerHTML = photo.title;

        var id = document.createElement('p');
        id.innerHTML = photo.id;

        var url = document.createElement('img');
        url.src = photo.url;

        var image = document.createElement('img');
        image.src = photo.image;

        photoElement.appendChild(title);
        photoElement.appendChild(id);
        photoElement.appendChild(url);
        photoElement.appendChild(image);

        document.getElementById('photo-list').appendChild(photoElement);
    }
}