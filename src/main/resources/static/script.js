document.querySelectorAll('nav ul li a').forEach(anchor => {
    anchor.addEventListener('click', function(e) {
        e.preventDefault();
        document.querySelector(this.getAttribute('href')).scrollIntoView({
            behavior: 'smooth'
        });
    });
});

document.getElementById('search-form').addEventListener('submit', function(event) {
    event.preventDefault();
    const searchInput = document.getElementById('search-input').value;
    const searchResults = document.getElementById('search-results');

    if (searchInput.trim() === '') {
        searchResults.innerHTML = `
            <h2>Search Results</h2>
            <p>No results found.</p>
        `;
    } else {
        searchResults.innerHTML = `
            <h2>Search Results for "${searchInput}"</h2>
            <p>List of jobs will be displayed here.</p>
        `;
    }

    searchResults.style.display = 'block';
    document.getElementById('about').scrollIntoView({ behavior: 'smooth' });
});
